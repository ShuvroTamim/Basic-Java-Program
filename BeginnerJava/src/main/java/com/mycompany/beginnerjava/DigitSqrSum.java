package com.mycompany.beginnerjava;

import java.util.Scanner;

public class DigitSqrSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int sum = 0, n;
        System.out.print("Enter the value of n: ");
        n = input.nextInt();
        System.out.print("The Square series: ");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(i + "^2 + ");
            sum = sum + i*i;
        }
        System.out.println("\nThe result: " + sum);
    }
}
