package com.mycompany.beginnerjava;

import java.util.Scanner;

public class EvenOddProgram {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num;
        System.out.print("Enter the Number: ");
        num = input.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("The number " + num + " is an Even number.");
        } else {
            System.out.println("The number " + num + " is an Odd number.");
        }
    }
}
