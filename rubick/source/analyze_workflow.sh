#!/usr/bin/env bash
#set -e
set -x

#
# $1 task id
# $2 search pattern in sourcegraph
# $3 api class pattern
#

ID=$1
SEARCH_PTRN=$2
ATTACK_SURFACE_PTRN=$3
API_PTRN=$4
WORKDIR=out/${ID}

[ $# -lt 4 ] && echo "bash X.sh id search_ptrn attack_surface_ptrn api_ptrn [rewrite]" && exit 1

REWRITE=no
[ "$5" = "rewrite" ] && REWRITE=yes

# out/targetname/
#       - src.json
#       - github_info.json
#       - possible_entry
#       - run_all.sh
#       - jars/
#       - jars_unzip/
#       - extracted/

already_ran () {
    [ -f ${WORKDIR}/possible_entry ] && echo -n yes && return
    [ -f ${WORKDIR}/run_all.sh ] && echo -n yes && return
    #[ -d ${WORKDIR}/jars_unzip ] && echo -n yes && return
    echo -n no
}

clean_previous() {
    rm -f ${WORKDIR}/possible_entry
    rm -f ${WORKDIR}/run_all.sh
    #rm -rf ${WORKDIR}/jars_unzip
}

ret=`already_ran`
if [ ${ret} = yes ]
then
    if [ ${REWRITE} = yes ]
    then
        clean_previous
    else
        echo ${WORKDIR} already exists and not rewrite, skipped
        exit 1
    fi
fi

# recursively apply 'jar xf' to all jars (& jars inside jars) inside its -i
#   , and output to ${WORKDIR}/jars_unzip
# N.B. this step assumes there is only one '/jars/' pattern for its -i
#      , and replace that to '/jars_unzip/' as ouput
python3 ./crawl_gen_runall/3.unzip.py -i ${WORKDIR}/jars/

# generate cmd option info for all possible consumer programs (-j) for an attack surface
# output to ${WORKDIR}/github_info.json/../possible_entry
# N.B. this step assumes & depends the layout of ${WORKDIR} (jars, jars_unzip, xxx.json, etc)
python3 ./crawl_gen_runall/4.generate_p_info.py -m ${WORKDIR}/github_info.json -a "${ATTACK_SURFACE_PTRN}" -t "${API_PTRN}"

# generate ${WORKDIR}/run_all.sh for an attack surface
python3 ./crawl_gen_runall/5.generate_run_sh.py -e ${WORKDIR}/possible_entry -o ${WORKDIR}

