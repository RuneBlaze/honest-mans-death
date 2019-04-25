#!/bin/bash
declare -i total=0
declare -i incorrect=0

red=`tput setaf 1`
green=`tput setaf 2`
reset=`tput sgr0`

echo "${green}Testing Started: If any errors occur it would be in red${reset}"

for i in honest-mans-death/**/*.java; do
    [ -f "$i" ] || break
    let "total=total+1"
    echo "========$i========"
    source honest-mans-death/runner.sh "${i%.*}"
    ec=$?
    if [ "$ec" -ne 0 ]; then
        echo "${red} $i not passed: $ec ${reset}"
        let "incorrect=incorrect+1"
    fi
    # echo "================="
done


rm honest-mans-death/**/*.class
rm honest-mans-death/**/*.out
rm honest-mans-death/**/*.mJAM
rm honest-mans-death/**/*.asm