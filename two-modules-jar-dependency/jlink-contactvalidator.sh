#!/bin/bash
set -x #echo on
jlink --modulepath .:../lib:$JAVA9_BIN/jmods/:two-modules/bin --addmods ch.trivadis.contactvalidator commonslang --output linkedjdk
