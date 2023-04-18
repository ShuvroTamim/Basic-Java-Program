package com.mycompany.javapatternprogram;

import java.util.Scanner;

public class PatternMix3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the limit: ");
        int n = input.nextInt();
        char ch = 'A';
        
        System.out.println("The Pattern- ");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row; col++) {
                //System.out.println(" "+" ");
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(" " + ch++);
            }
            ch = 'A';
            System.out.println("");
        }
        
        for (int row = n-1; row >= 1; row--) {
            for (int col = 1; col <= n-row; col++) {
                //System.out.println(" "+" ");
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(" " + ch++);
            }
            ch = 'A';
            System.out.println("");
        }
    }
}
