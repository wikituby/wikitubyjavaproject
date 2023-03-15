package com.fxgo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //vat calculator
        VatCalculator vatonj = new VatCalculator();
        vatonj.myVat();

        // nssf calculator
        NssfCalculator nssfobj = new NssfCalculator();
        nssfobj.myNssf();

        //Simple Interest Calculator
        SimpleInterestCalculator siobj = new SimpleInterestCalculator();
        siobj.mySical();

    }

}


