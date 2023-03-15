package com.fxgo;

import java.util.Scanner;

public class VatCalculator {
    public static void mainvat() {
        final double VAT_CHARGE = 0.18; // 18% VAT rate in uganda
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of the goods to be supplied: ");
        double price = input.nextDouble();

        double vatAmount = price * VAT_CHARGE;
        double totalPrice = price + vatAmount;

        System.out.printf("VAT: %.2f%n", vatAmount);
        System.out.printf("Total price to be paid: %.2f%n", totalPrice);
    }


}
