package com.mycompany.javapatternprogram;

import java.util.Scanner;

public class JavaPattern1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of Row: ");
        int n = input.nextInt();
        
        System.out.println("The pattern: ");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" " + col);
            }
            System.out.println("");
        }
    }
}
