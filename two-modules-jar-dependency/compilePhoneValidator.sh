#!/bin/bash
set -x #echo on
javac -modulepath ../lib -d ch.trivadis.phoneValidator $(find ch.trivadis.phoneValidator -name "*.java")
