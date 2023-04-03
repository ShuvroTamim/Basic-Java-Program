package com.mycompany.beginnerjava;

import java.util.Scanner;

public class MultipleMultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n, m;
        System.out.print("Enter the initaial number: ");
        n = input.nextInt();
        
        System.out.print("Enter the final number: ");
        m = input.nextInt();
        System.out.println("");
        
        for (int i = n; i <= m; i++) {
            for (int j = 1; j <= 10; j++) {
                int rslt = i * j;
            System.out.println(i + " X " + j + " = " + rslt);
            }
            System.out.println("");
        }
    }
}
