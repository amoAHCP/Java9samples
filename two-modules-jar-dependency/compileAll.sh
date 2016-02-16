#!/bin/bash
set -x #echo on
javac -modulepath ../lib -d .  -modulesourcepath . $(find . -name "*.java")
