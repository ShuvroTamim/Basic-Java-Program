package com.mycompany.beginnerjava;

import java.util.Scanner;


public class JavaOddSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int sum = 0, n;
        System.out.print("Enter the value of n: ");
        n = input.nextInt();
        System.out.print("The odd series: ");
        
        for (int i = 1; i <= n; i=i+2) {
            System.out.print(i + " ");
            sum = sum + i;
        }
        System.out.println("\nThe result: " + sum);
    }
}
