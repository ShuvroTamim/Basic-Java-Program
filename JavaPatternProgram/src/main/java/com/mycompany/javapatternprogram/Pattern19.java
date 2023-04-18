package com.mycompany.javapatternprogram;

import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Row Number: ");
        int n = input.nextInt();
        
        System.out.println("The pattern: ");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row; col++) {
                System.out.print(" " + '*');  //Need double space
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(" " + col%2); //As here is one space
            }
            System.out.println("");
        }
    }
}
