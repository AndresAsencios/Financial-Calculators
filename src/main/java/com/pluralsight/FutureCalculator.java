package com.pluralsight;

import java.util.Scanner;

public class FutureCalculator {
    public static void calculate() {
        Scanner read = new Scanner(System.in);


        System.out.println("Enter your initial deposit: ");
        double principal = read.nextDouble();

        System.out.println("Enter annual interest rate (%): ");
        double annualRate = read.nextDouble();

        System.out.println("Enter number of years: ");
        int years = read.nextInt();

        int dayPerYear = 365;
        int totalNumberOfDays = dayPerYear * years;

        double interestRate = annualRate / 100;
        double futureValue = principal * Math.pow(1 + interestRate / dayPerYear, totalNumberOfDays);

        double totalInterest = futureValue - principal;

        System.out.printf("Future Value: $%.2f%n", futureValue);
        System.out.printf("Total Interest Earned: $%.2f%n", totalInterest);

//        read.close();



    }
}
