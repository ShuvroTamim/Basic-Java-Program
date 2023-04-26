package com.mycompany.javapatternprogram;

import java.util.Scanner;

public class PatternRowColumn17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the limit: ");
        int n = input.nextInt();
        System.out.println("The Pattern- ");
        
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == n || col == 1 || col == n) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
