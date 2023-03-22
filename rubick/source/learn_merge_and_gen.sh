#!/bin/bash

#set -e
set -x

[ $# -lt 3 ] && echo bash mtest.sh tinker/all taskid 'nfafile [nfafile ...]' && exit 1

mode=$1
taskid=$2

if [ "$mode" != "tinker" ]
then
    if [ "$mode" != "all" ]
    then
        echo unknown mode, not tinker/all
        exit 1
    fi
fi

export BASE=workdir/${taskid}
export ALPHABET=${BASE}/alphabet.json
export APIMETA=${BASE}/meta.json
export RESULT=${BASE}/result
export SEEDS=seeds/${taskid}

rm -rf ${RESULT}
mkdir -p ${RESULT}

runOne() {
    TARGET=$1
    NFAP=$2
    STAGE=$3
    DOT=$4

    WORKDIR=${BASE}/${TARGET}
    rm -rf ${WORKDIR}
    mkdir -p ${WORKDIR}

    time bash run.sh aln \
        -a ${ALPHABET} \
        -m ${APIMETA} \
        -o ${WORKDIR}/result.dot \
        -wd ${WORKDIR} \
        -i ${SEEDS} \
        -s ${STAGE} \
        ${NFAP} \
        > ${WORKDIR}/log.txt 2>&1

    if [ "${DOT}" != "" ] 
    then
        cp ${DOT} ${WORKDIR}
    fi

    if [ -f ${WORKDIR}/result.dot ]
    then
        # remove the dead loops
        #python3 automata/nfa.py REMOVEDEADLOOP ${ALPHABET} ${WORKDIR}/result.dot-nfa.txt
        dot -Tpdf ${WORKDIR}/result.dot -O
        cp ${WORKDIR}/result.dot.pdf ${RESULT}/${TARGET}.pdf
    else
        echo Failed to tinker $TARGET 
    fi

}

export -f runOne

for arg in "${@:3}"
do
    f=`basename $arg`
    echo "$f"
done | parallel -j 20 runOne '{}' -p\\ ${BASE}/nfa/'{}' tinker ${BASE}/nfa/'{}'-after-replace.dot
#done | parallel -j 20 runOne '{}' -p\\ ${BASE}/nfa/'{}' merge ${BASE}/nfa/'{}'-after-replace.dot

python3 automata/nfa.py REMOVEDEADLOOP ${ALPHABET} ${BASE}/*.txt/result.dot-nfa.txt

if [ "$mode" != "all" ]
then
    echo not merge since mode is tinker
    exit 0
fi

NFAS=""
for arg in "${@:3}"
do
    f=`basename $arg`
    if [ -f "${BASE}/${f}/result.dot-nfa.txt" ]
    then
        NFAS=${NFAS}" -d ${BASE}/${f}/result.dot-nfa.txt "
    fi
done

if [ "${NFAS}" = "" ]
then
    echo all tinkered targets have failed
    exit 1
fi

rm -rf ${BASE}/merged
mkdir -p ${BASE}/merged
time bash run.sh mg -a ${ALPHABET} ${NFAS} -o ${BASE}/merged/result.dot
dot -Tpdf ${BASE}/merged/result.dot -O
cp ${BASE}/merged/result.dot.pdf ${RESULT}/merged.pdf

python automata/nfa.py CALCCFNUM ${ALPHABET} ${BASE}/merged/result.dot-nfa.txt

#
# prepare everything for fuzzing
#
rm -rf ${BASE}/fuzzing
mkdir -p ${BASE}/fuzzing

cp ${BASE}/merged/cfPicks.json ${BASE}/fuzzing/cfPicks.json
cp ${BASE}/merged/result.dot-nfa.txt ${BASE}/fuzzing/nfa.txt
cp ${ALPHABET} ${BASE}/fuzzing/alphabet.json

bash run.sh gen -a ${ALPHABET} -m ${APIMETA} -i ${SEEDS} -n ${BASE}/merged/result.dot-nfa.txt -o ${BASE}/fuzzing -p ${BASE}/merged/cfPicks.json

sed -i 's/.*UNCOMMENT THIS WHEN FUZZING.*//g' ${BASE}/fuzzing/Fuzzer.java
