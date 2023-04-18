package com.mycompany.javapatternprogram;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Row Number: ");
        int n = input.nextInt();
        
        System.out.println("The pattern: ");
        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" " + col%2);
            }
            System.out.println("");
        }
    }
}
