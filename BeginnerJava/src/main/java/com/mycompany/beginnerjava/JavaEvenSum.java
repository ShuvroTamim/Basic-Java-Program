package com.mycompany.beginnerjava;

import java.util.Scanner;

public class JavaEvenSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int sum = 0, n;
        System.out.print("Enter the value of n: ");
        n = input.nextInt();
        System.out.print("The Even series: ");
        
        for (int i = 0; i <= n; i=i+2) {
            System.out.print(i + " ");
            sum = sum + i;
        }
        /*
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                sum = sum + i;
            }
        Same output as previous for logic.
        */
        System.out.println("\nThe result: " + sum);
    }
}
