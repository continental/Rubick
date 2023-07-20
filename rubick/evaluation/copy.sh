#!/bin/bash

set -x
set -e

DOWNLOAD_DIR=$1

for d in */jars jazzer */seeds */*/own-seeds;
do
	cp ${DOWNLOAD_DIR}/$d/* $d/
done
