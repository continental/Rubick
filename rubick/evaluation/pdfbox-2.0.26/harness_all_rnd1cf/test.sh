#!/bin/bash

class_name=com.fuzz.Fuzzer
class_path=`ls ./jars/*.jar | while read f ; do  echo $f; done | tr '\n' ':'`../../jazzer/jazzer_agent_deploy.jar:./out/Fuzzer.jar

rm -rf seeds
cp -r own-seeds seeds

SECONDS=5

# if has argument, then run fuzzing mode, else run test mode (only execute once)
if [ $# -ne 0 ] 
then
	# fuzz test
	#../../jazzer/jazzer_driver --cp=${class_path} --target_class=${class_name} --jvm_args="-Xmx2048m" --reproducer_path=/dev/null -max_total_time=$SECONDS -close_fd_mask=3 ./seeds 
	#../../jazzer/jazzer_driver --cp=${class_path} --target_class=${class_name} --jvm_args="-Xmx2048m" --reproducer_path=/dev/null -max_total_time=$SECONDS ./seeds 
	#../../jazzer/jazzer_driver --cp=${class_path} --target_class=${class_name} --jvm_args="-Xmx2048m" --reproducer_path=/dev/null -max_total_time=$SECONDS -close_fd_mask=3 --instrumentation_excludes=net.automatalib.**:ahg.**:org.json.simple.**:com.fuzz.** ./seeds 
	../../jazzer/jazzer_driver --cp=${class_path} --target_class=${class_name} --jvm_args="-Xmx2048m" --reproducer_path=/dev/null -max_total_time=$SECONDS -close_fd_mask=3 -rss_limit_mb=10240 --instrumentation_excludes=net.automatalib.**:ahg.**:org.json.simple.** ./seeds 
else
	# dry run test
	../../jazzer/jazzer_driver --cp=${class_path} --target_class=${class_name} --jvm_args="-Xmx2048m" --reproducer_path=/dev/null -runs=2 --instrumentation_excludes=net.automatalib.**:ahg.**:org.json.simple.**:com.fuzz.** ./seeds 
fi

