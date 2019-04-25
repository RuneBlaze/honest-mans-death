#!/bin/bash
red=`tput setaf 1`
green=`tput setaf 2`
reset=`tput sgr0`

java miniJava.Compiler "$1.java"
ec=$?
if [ "$ec" -ne 0 ]; then
    echo "${red}Your compiler failed at $1.java${reset}"
fi
java mJAM.Disassembler "$1.mJAM"
java mJAM.Interpreter "$1.mJAM" | grep ">>>" | sed "s/>>> //g" > "$1.mJAM.out"
ec=$?
if [ "$ec" -ne 0 ]; then
    echo "${red}Your compiler produced incorrect output at $1.java${reset}"
fi
javac "$1.java"
java -cp "$(dirname "$1")" "$(basename -- "$1")" > "$1.java.out"
diff "$1.mJAM.out" "$1.java.out"
ec=$?
if [ "$ec" -ne 0 ]; then
    echo "${red}Your output and java's output differs${reset}"
fi