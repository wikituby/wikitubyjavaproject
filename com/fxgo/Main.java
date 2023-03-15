package com.fxgo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //vat calculator on goods in uganda
        VatCalculator vatonj = new VatCalculator();///instantiating vat obj
        vatonj.mainvat();

        // NSSF contribution calculator in uganda
        nssf(); //calling nsf method

        //calculate simple interest
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;

        System.out.println();
        System.out.println("///////lets calculate your simple interest/////");
        System.out.println();

        System.out.println("Please input the amount to lend in UGX");
        principal = Integer.parseInt(scanner.nextLine());

        System.out.println("Please input your rate per month");
        rate = Integer.parseInt(scanner.nextLine());

        double rateCalPerMonth = rate / 100;
        double rateCalPerDay = (rateCalPerMonth) / 30;
        double rateCalPerWeek = (rateCalPerDay) * 7;
        double rateCalPerYear = (rateCalPerMonth) * 12;

        System.out.println("simple interest paid per day: " + "sh:" + principal * rateCalPerDay);
        System.out.println("simple interest paid per Week: " + "sh:" + principal * rateCalPerWeek);
        System.out.println("simple interest paid per Month: " + "sh:" + principal * rateCalPerMonth);
        System.out.println("simple interest paid per Year: " + "sh:" + principal * rateCalPerYear);
    }

    public static void nssf() {

        System.out.println();
        System.out.println("///////lets calculate the nssf contribution in uganda/////");
        System.out.println();

        final double nssfCHARGE = 0.05; // 5% nssf contribution in uganda
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Salary of the employee in ugx shilling: ");
        double salary = input.nextDouble();

        System.out.println("NSSF Contribution per month shs: " + nssfCHARGE*salary);
        System.out.println("Net Income to be paid as salary shs: " + (salary-(nssfCHARGE*salary)));
    }
}


