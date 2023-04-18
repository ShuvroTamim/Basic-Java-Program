package com.mycompany.javapatternprogram;

import java.util.Scanner;


public class JavaPattern3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Row Number: ");
        int n = input.nextInt();
        
        System.out.println("The pattern: ");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                int colBool = col%2;
                System.out.print(" " + colBool);
            }
            System.out.println("");
        }
    }
}
