#!/bin/bash
set -x #echo on
jar --create --file=bin/phonevalidator.jar --module-version=1.0  -C ch.trivadis.phoneValidator .
