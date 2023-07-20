#!/bin/bash

set -x
set -e

for d in apachepoi-5.2.1 apachetar-1.21 itextpdf-7.2.2 junrar-7.4.1 pdfbox-2.0.26 zip4j-2.9.1
do
    for h in harness_all_cfseeds  harness_all_fuzzgen  harness_all_human  harness_all_rnd1cf  harness_all_rnd1seed  harness_all_wocf harness_all_itercf harness_all_raw
    do

        echo $d/$h
        cd $d/$h

        bash clean.sh
        bash build.sh

        echo test running $d/$h
        bash test.sh
        #read

        echo test fuzzing $d/$h
        bash test.sh 1
        #read

        cd ../..

    done
done
