package com.mycompany.beginnerjava;

import java.util.Scanner;

public class Assignment12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int sum = 0, n;
        System.out.print("Enter the value of n: ");
        n = input.nextInt();
        
        //printing the sum of the odd number series.
        System.out.print("The odd number series: ");
        for (int i = 1; i <= n; i++) {
            if (i%2 != 0) {
                System.out.print(i + " ");
                sum = sum + i;
            }
            
        }
        System.out.println("\nTotal sum= " + sum);

    }
}
