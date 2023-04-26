package com.mycompany.javapatternprogram;

import java.util.Scanner;

public class PatternRowColumn2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the limit: ");
        int n = input.nextInt();
        
        System.out.println("The pattern- ");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row; col++) {
                int cell = row*col;
                System.out.print("  ");
            }
            
            for (int col = 1; col <= 2*row-1; col++) {
                //int cell = 2*row-1;
                System.out.print(" " + "*");
            }
            System.out.println(" ");
        }
    }
}
