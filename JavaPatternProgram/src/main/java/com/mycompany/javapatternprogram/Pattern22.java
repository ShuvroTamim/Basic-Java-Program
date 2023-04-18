package com.mycompany.javapatternprogram;

import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Row Number: ");
        int n = input.nextInt();
        char ch = 'A';
        
        System.out.println("The pattern: ");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row; col++) {
                System.out.print(" " + " ");  //Need double space
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(" " + ch++); //As here is one space
            }
            ch = 'A';
            System.out.println("");
        }
    }
}
