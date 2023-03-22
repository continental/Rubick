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
API_PTRN=$3
WORKDIR=out/${ID}

[ $# -lt 3 ] && echo "bash X.sh id search_ptrn api_ptrn [rewrite]" && exit 1

# out/targetname/
#       - src.json
#       - github_info.json
#       - possible_entry
#       - run_all.sh
#       - jars/
#       - jars_unzip/
#       - extracted/

# ./run_whole_workflow.sh org.apache.pdfbox.pdmodel.PDDocument pdfbox
# This will generate a {targetid}.json file inside the ${WORK_DIR} folder
bash ./crawl_gen_runall/1.src_search.sh "${SEARCH_PTRN}" $WORKDIR

# This use {targetid}.json as a input to crawl all jar releases to the ${WORKDIR}/jars folder and a {targetid}_info.json at the ${WORKDIR}
python3 ./crawl_gen_runall/2.crawl_repo_info.py -s ${WORKDIR}/src.json

