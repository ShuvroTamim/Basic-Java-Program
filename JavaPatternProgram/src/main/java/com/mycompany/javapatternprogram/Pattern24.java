package com.mycompany.javapatternprogram;

import java.util.Scanner;

public class Pattern24 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Row Number: ");
        int n = input.nextInt();
        
        System.out.println("The pattern: ");
        for (int row = n; row >= 1; row--) {
            
            for (int col = 1; col <= n-row; col++) {
                System.out.print(" " + " ");  //Need double space
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(" " + col); //As here is one space
            }
            
            System.out.println("");
        }
    }
}
