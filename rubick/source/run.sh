#!/bin/bash

#set -x 

# mvn yyds lol
mvn clean compile assembly:single
java -Dlog4j.configurationFile=./log4j2.xml -jar target/AutomataHarness-1.0-SNAPSHOT-jar-with-dependencies.jar "$@"