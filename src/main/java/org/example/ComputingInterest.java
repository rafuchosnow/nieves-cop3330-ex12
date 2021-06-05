package org.example;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ComputingInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        String principalString = input.nextLine();
        float principalNumber = Float.parseFloat(principalString);

        System.out.print("Enter the rate of interest: ");
        String rateString = input.nextLine();
        float rateNumber = Float.parseFloat(rateString);

        System.out.print("Enter the number of years: ");
        String yearString = input.nextLine();
        float yearNumber = Float.parseFloat(yearString);

        double formula = principalNumber * (1 + ((rateNumber / 100) * yearNumber));
        DecimalFormat dfDollar = new DecimalFormat("#.##");

        System.out.println("After " + yearNumber + " years at " + rateNumber + "%, " +
                "the investment will be worth $" + dfDollar.format(formula) + ".");
    }
}
