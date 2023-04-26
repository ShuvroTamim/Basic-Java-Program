package com.mycompany.javapatternprogram;

import java.util.Scanner;

public class PatternMix5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the limit: ");
        int n = input.nextInt();
        
        System.out.println("The pattern- ");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row; col++) {
                System.out.print("  ");
            }
            
            for (int col = 1; col <= 2*row-1; col++) { //col<=2*n-1
                System.out.print(" " + row);
            }
            System.out.println(" ");
        }
        
        for (int row = n-1; row >= 1; row--) {
            for (int col = 1; col <= n-row; col++) {
                System.out.print("  ");
            }
            
            for (int col = 1; col <= 2*row-1; col++) { //col<=2*n-1
                System.out.print(" " + row);
            }
            System.out.println(" ");
        }
    }
}
