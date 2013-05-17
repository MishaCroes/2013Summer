#! /bin/bash

var1="Double.NaN"
rep1="-1"
var2="(NSDecimal) "
rep2="(int) "
sed -i.bak "s/${var1}/${replace1}/g" $1