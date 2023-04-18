package com.mycompany.javapatternprogram;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Row Number: ");
        int n = input.nextInt();
        char ch = 'A';
        //char ch = 65;According to ASCII same as A.
        
        System.out.println("The pattern: ");
        for (int row = 1; row <= n; row++) {
            
            for (int col = 1; col <= row; col++) {
                System.out.print(" " + ch);
            }
            ch++;
            System.out.println("");
        }
    }
}
