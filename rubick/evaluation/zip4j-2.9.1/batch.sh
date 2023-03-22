#!/bin/bash

#set -x
set -e

# build or build & test
# bash batch.sh [test]

for d in harness_*
do
	cd $d

	echo $d

	bash build.sh >/dev/null 2>&1 || echo build $d error, check

	if [ "$1" == 'test' ] 
	then
		bash test.sh 2>&1 | rg cov: | tail -n 1
		bash test.sh 1 2>&1 | rg cov: | tail -n 1
    elif [ "$1" == 'calibrate' ]
    then
        for i in {1..5}
        do
            bash test.sh 2>&1 | ts "%.s" | rg "seed corpus|INITED" | awk '{print $1}' | tr '\n' ' ' | awk '{print($2 - $1)}'
        done | awk 'START{max=0} {max = $1 > max ? $1 : max;} END{printf("max duration from seed corpus to INITED %.2f s\n", max)}'
        #done | awk 'START{s=0} {s = s + $1} END{printf("avg duration from seed corpus to INITED %.2f s\n", s/5)}'
	fi

	bash clean.sh 

	cd ..
done

