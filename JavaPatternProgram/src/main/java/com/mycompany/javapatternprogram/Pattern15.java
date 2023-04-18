package com.mycompany.javapatternprogram;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Row Number: ");
        int n = input.nextInt();
        
        System.out.println("The pattern: ");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" " + row%2);
            }
            System.out.println("");
        }
        for (int row = n-1; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" " + row%2);
            }
            System.out.println("");
        }
    }
}
