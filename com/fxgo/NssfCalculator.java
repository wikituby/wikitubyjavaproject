package com.fxgo;

import java.util.Scanner;

public class NssfCalculator {
    public void myNssf() {

        System.out.println();
        System.out.println("NSSF calculator");
        System.out.println();

        final double nssfCHARGE = 0.05; // 5% nssf contribution in uganda
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Salary of the employee in ugx shilling: ");
        double salary = input.nextDouble();

        System.out.println("NSSF Contribution per month shs: " + nssfCHARGE * salary);
        System.out.println("Net Income to be paid as salary shs: " + (salary - (nssfCHARGE * salary)));
    }
}