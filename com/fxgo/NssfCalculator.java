package com.fxgo;

import java.util.Scanner;

public class NssfCalculator {
    public void myNssf() {

        System.out.println();
        System.out.println("NSSF calculator");

        final double nssfRate = 0.05; // 5% nssf contribution in uganda
        Scanner input = new Scanner(System.in);

        System.out.print("Please choose what you want to Calculate:\n1.NSSF Charge\n2.NSSF Rate\n3.Net Income after NSSF Charge\n4.Gross Income before NSSF Charge\n5.Back to Main Menu\n ");
        double myNssfCal = input.nextDouble();

        if(myNssfCal==1){


        } else if (myNssfCal==2) {

        } else if (myNssfCal==3) {

        } else if (myNssfCal==4) {

        } else if (myNssfCal==5) {
            MySimpCalOuterClass objoutermainclass= new MySimpCalOuterClass();
            objoutermainclass.mySimplecalMethod();
        }


        //System.out.println("NSSF Contribution per month shs: " + nssfRate * salary);
        //System.out.println("Net Income to be paid as salary shs: " + (salary - (nssfRate * salary)));
    }
}