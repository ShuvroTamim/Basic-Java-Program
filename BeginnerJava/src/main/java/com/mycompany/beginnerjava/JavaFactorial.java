package com.mycompany.beginnerjava;

import java.util.Scanner;

public class JavaFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int fact = 1, n, l;
        System.out.print("Enter the value of n: ");
        n = input.nextInt();
        
        for (int i = n; i >= 1; i--) {
            fact = fact*i;
            //l = i - (i-1);
            System.out.println("fact step " + i + " value is: " + fact);
        }
        System.out.println("\nThe factorial of " + n + "! is= " + fact);
    }
}
