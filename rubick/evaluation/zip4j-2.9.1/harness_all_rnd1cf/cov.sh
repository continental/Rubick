#!/bin/bash

set -e
#set -x

class_name=com.fuzz.Fuzzer
class_path=`ls ./jars/*.jar | while read f ; do  echo $f; done | tr '\n' ':'`../../jazzer/jazzer_agent_deploy.jar:./out/Fuzzer.jar

rm -rf covseeds
cp -r seeds covseeds

SECONDS=10

# calc final cov
../../jazzer/jazzer_driver --cp=${class_path} --target_class=${class_name} --jvm_args="-Xmx2048m" --reproducer_path=/dev/null -max_total_time=$SECONDS -close_fd_mask=3 --instrumentation_excludes=net.automatalib.**:ahg.**:org.json.simple.**:com.fuzz.** ./covseeds 2>&1 | rg INITED

