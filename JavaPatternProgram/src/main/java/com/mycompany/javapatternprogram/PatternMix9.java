package com.mycompany.javapatternprogram;

import java.util.Scanner;

public class PatternMix9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the limit: ");
        int n = input.nextInt();
        System.out.println("The Pattern- ");
        
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(" "+col+"  ");
            }
            System.out.println("");
        }
        
        for (int row = n-1; row >= 1; row--) {
            for (int col = 1; col <= n-row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(" "+col+"  ");
            }
            System.out.println("");
        }
    }
}
