package com.mycompany.beginnerjava;

import java.util.Scanner;

public class DetectCapSmallLetter {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        char ch;
        System.out.print("Enter a Character: ");
        ch = input.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("The letter " + "\'" + ch + "\'" + " is a small letter.");
        }
        else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("The letter " + "\'" + ch + "\'" + " is a Capital letter.");
        }
        else {
            System.out.println("Please enter a valid letter.");
        }
    }
}
