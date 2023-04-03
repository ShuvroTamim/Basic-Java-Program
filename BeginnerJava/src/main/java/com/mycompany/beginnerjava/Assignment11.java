package com.mycompany.beginnerjava;

import java.util.Scanner;

public class Assignment11 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int fact = 1, n;
        System.out.print("Enter the value of n: ");
        n = input.nextInt();
        
        for (int i = 1; i <= n; i++) {
            fact = fact*i;
            System.out.println("fact step " + i + " value is: " + fact);
        }
        System.out.println("\nThe factorial of \'" + n + "\' is= " + fact);
    }
}
