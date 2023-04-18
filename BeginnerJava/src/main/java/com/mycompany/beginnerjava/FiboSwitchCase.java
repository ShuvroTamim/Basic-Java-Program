package com.mycompany.beginnerjava;

import java.util.Scanner;

public class FiboSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n;
        System.out.print("Enter the limit: ");
        n = input.nextInt();
        
        int first = 0;
        int scnd = 1;
        int fibo = 0;
        
        switch (n) {
            case 0:
                System.out.println("Not a valid number.");
                break;
            case 1:
                System.out.print("Fibonacci Series: ");
                System.out.print(first);
                System.out.println("\nThe " + n + "st value is: " + first);
                break;
            case 2:
                System.out.print("Fibonacci Series: ");
                System.out.print(first + " " + scnd);
                System.out.println("\nThe " + n + "nd value is: " + scnd);
                break;
            default:
                System.out.print("Fibonacci Series: ");
                System.out.print(first + " " + scnd);
                for (int i = 3; i <= n; i++) {  // As already 0 and 1 printed. i started from 3.
                    fibo = first + scnd;
                    first = scnd;
                    scnd = fibo;
                    System.out.print(" " + fibo);
                }       System.out.println("\nThe " + n + "th value is: " + fibo);
                break;
        }
    }
}
