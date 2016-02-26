#!/bin/bash
set -x #echo on
rm -R mods
javac -d mods -modulesourcepath . $(find . -name "*.java")
