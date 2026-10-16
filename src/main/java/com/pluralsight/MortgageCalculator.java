package com.pluralsight;

import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);




        System.out.println("Enter the loan amount: ");
        double principal = read.nextDouble();
        System.out.println("Enter your down payment: ");
        double downPayment = read.nextDouble();

        System.out.println("Enter annual interest rate (%): ");
        double annualRate = read.nextDouble();

        System.out.println("Enter loan length in years: ");
        int years = read.nextInt();

        double monthlyRate = annualRate / 100 / 12;
        int numberOfPayments = years * 12;
        double loanAmount = principal - downPayment;



        double monthlyPayment;

        if (annualRate == 0) {
            monthlyPayment = loanAmount / numberOfPayments;

        } else {
            double compoundFactor = Math.pow(1 + monthlyRate, numberOfPayments);

            monthlyPayment = loanAmount * (monthlyRate * compoundFactor) / (compoundFactor - 1);
        }



        double totalInterest = (monthlyPayment * numberOfPayments) - loanAmount;


        System.out.printf("Down Payment: $%.2f%n", downPayment);
        System.out.printf("Loan Amount After Down Payment: $%.2f%n", loanAmount);
        System.out.printf("Monthly Payment: $%.2f%n", monthlyPayment);
        System.out.printf("Total Interest: $%.2f%n", totalInterest);
        read.close();
    }
}
