package com.mycompany.beginnerjava;

public class Assignment10 {
    public static void main(String[] args) {
        int sum = 0;
        
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
            System.out.println("Result " + i + ": " + sum);
        }
        System.out.println("\nThe sum of 1-10 is: " + sum);
    }
}
