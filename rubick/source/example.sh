#!/bin/bash

set -x 

[ $# -ne 2 ] && echo bash whole.sh TASK EXBASEDIR && exit 1

TASK=$1
EXDIR=$2

MANUAL=manual/${TASK}
SEEDS=seeds/${TASK}
WORKDIR=workdir/${TASK}

assertIsDirNotEmpty() {
    dir=$1
    if [ -d "$dir" ]
    then
        if [ -z "$(ls -A $dir)" ]
        then
            echo $dir is empty dir
            exit 1
        else
            echo ok
        fi
    else
        echo $dir does not exist
        exit 1
    fi
}

assertIsFile() {
    file=$1
    if [ -f "$file" ]
    then
        echo ok
    else
        echo $file does not exist
        exit 1
    fi
}

assertIsDirNotEmpty ${MANUAL}
assertIsDirNotEmpty ${SEEDS}

#
# Step 1: extract usage automata from example programs
# 
## gen automata & a2dg graphes from example
#rm -rf ${EXDIR}/extracted
#rm -rf ${EXDIR}/manualcompile/extracted
#bash ${EXDIR}/run_selected.sh
#mv ${EXDIR}/manualcompile/extracted/* ${EXDIR}/extracted/
#cp organize.sh ${EXDIR}/extracted/

#set -e

#
# Step 2: merge automata
# merging information
rm -rf ${WORKDIR}
# gen alphabet & api metas
python3 automata/libautomata.py ${WORKDIR} ${EXDIR}/extracted ${MANUAL}
python3 automata/nfa.py REPLACE ${WORKDIR}/alphabet.json ${MANUAL}/replaces.json ${WORKDIR}/nfa/*.txt

#
# Step 3 & 4: learn and merge the usage automata, and generate the fuzz driver
#
# tinkering & merging automata based harness
# automata based harness
# gen tinkered & merged automata code & nfa
bash learn_merge_and_gen.sh all ${TASK} ${WORKDIR}/nfa/*.txt

# fuzzgen harness
# gen merged a2dg nfa
#python3 automata/a2dg.py ${WORKDIR} ${EXDIR}/extracted
# gen merged a2dg code (big giant)
#bash run.sh gen -a ${WORKDIR}/alphabet.json -m ${WORKDIR}/meta.json -i ${SEEDS} -o ${WORKDIR}/a2dg -n ${WORKDIR}/a2dg/A2DG_M*.txt
# gen merged a2dg code (after tinkering)
#bash run.sh aln -a ${WORKDIR}/alphabet.json -m ${WORKDIR}/meta.json -o ${WORKDIR}/a2dg-tinker/result.dot -wd ${WORKDIR}/a2dg-tinker -i ${SEEDS} -s tinker -p ${WORKDIR}/a2dg/A2DG_M*.txt
