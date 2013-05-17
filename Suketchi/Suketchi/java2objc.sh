#! /bin/bash

var_Double_NaN="Double.NaN"
rep_minus_one="-1"

var_NSDecimal="(NSDecimal) "
rep_int="(int) "

var_pType="NSDecimal p"
rep_pNewType="int p"

var_NSDecimali="(NSDecimal)i"
rep_NSNumberi="(NSNumber*)i"

sed -i.bak -e "s/${var_NSDecimal}/${rep_int}/g" $1

sed -i.bak -e "s/${var_Double_NaN}/${rep_minus_one}/g" -e "s/${var_NSDecimal}/${rep_int}/g" -e "s/${var_pType}/${rep_pNewType}/g" -e "s/${var_NSDecimali}/${rep_NSNumberi}/g" $2