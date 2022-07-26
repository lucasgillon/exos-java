package com.hetfield.exosjava;

public class Exercice {
    public static int calculateYears(double principal, double interest, double tax, double desired) {
        int years = 0;
        while (principal < desired) {
            principal += principal * interest * (1 - tax);
            years++;
        }

        return years;
    }

    public static void main(String[] args) {
        System.out.println(calculateYears(1000, 0.05, 0.18, 1100));
    }
}

