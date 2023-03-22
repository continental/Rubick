#!/bin/bash

bazel clean
bazel build //:Fuzzer

mkdir -p out
rm -rf out/Fuzzer.jar
cp bazel-bin/Fuzzer.jar out/

