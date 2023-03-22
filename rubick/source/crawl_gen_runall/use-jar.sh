#!/bin/bash

#set -e
# the following 2 need to be absolute paths
JARFILE=$1
EXTRACTTO=$2

cd ${EXTRACTTO}

jar xf ${JARFILE}

cd - 2>&1 > /dev/null
