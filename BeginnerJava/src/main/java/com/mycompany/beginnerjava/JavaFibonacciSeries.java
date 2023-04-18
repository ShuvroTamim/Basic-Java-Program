package com.mycompany.beginnerjava;

import java.util.Scanner;

public class JavaFibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n;
        System.out.print("Enter the limit: ");
        n = input.nextInt();
        
        int first = 0;
        int scnd = 1;
        int fibo;
        
        System.out.print("Fibonacci Series: ");
        System.out.print(first + " " + scnd);
        for (int i = 3; i <= n; i++) {  // As already 0 and 1 printed. i started from 3.
            fibo = first + scnd;
            first = scnd;
            scnd = fibo;
            System.out.print(" " + fibo);
        }
    }
}
