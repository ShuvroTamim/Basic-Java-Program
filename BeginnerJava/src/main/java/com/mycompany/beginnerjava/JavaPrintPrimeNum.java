package com.mycompany.beginnerjava;

import java.util.Scanner;

public class JavaPrintPrimeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n, m, count = 0, totalPrime = 0;
        System.out.print("Enter Initial number: ");
        n = input.nextInt();
        System.out.print("Enter Last number: ");
        m = input.nextInt();
        
        System.out.print("Prime numbers are: ");
        for (int i = n; i <= m; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.print(i + " ");
                totalPrime++;
            }
            count = 0;  // As the value of count has changed.
        }
        System.out.println("\nTotal Prime numbers are: " + totalPrime);
    }
}
