package com.pluralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    int choice = 0;

    while (choice !=3) {

        System.out.println("\n=== Welcome to The Financial Calculators! ===");
        System.out.println("1. Mortgage Calculator");
        System.out.println("2. Future Value Calculator");
        System.out.println("3. Exit");

        System.out.println("Enter your choice: ");
        choice = read.nextInt();

        switch (choice) {
            case 1:
                MortgageCalculator.calculate();
                break;

            case 2:
                FutureCalculator.calculate();
                break;

            case 3:
                System.out.println("Goodbye!");
                break;

            default:
                System.out.println("Invalid choice");

        }
    }
    read.close();
    }
}