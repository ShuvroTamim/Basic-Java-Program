package com.mycompany.beginnerjava;

import java.util.Scanner;

public class CharacterCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        char ch;
        System.out.print("Enter a Character: ");
        ch = input.next().charAt(0);
        
        if ((ch >= 97) && (ch <= 122)) {
            System.out.println("The Character " + "\'" + ch + "\'" + " is a small letter.");
        }
        else if ((ch >= 65) && (ch <= 90)) {
            System.out.println("The Character " + "\'" + ch + "\'" + " is a Capital letter.");
        }
        else if ((ch >= 48) && (ch <= 57)) {
            System.out.println("The Character " + "\'" + ch + "\'" + " is a Digit.");
        }
        else if ((ch >= 0) && (ch <= 47) || (ch >= 58) && (ch <= 64) || (ch >= 91) && (ch <= 96) || (ch >= 123) && (ch <= 127)) {
            System.out.println("The Character " + "\'" + ch + "\'" + " is a Special Character.");
        }
        else {
            System.out.println("Please enter a valid Character.");
        }
    }
}
