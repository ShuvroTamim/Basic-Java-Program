package com.mycompany.beginnerjava;

import java.util.Scanner;

public class DetectVowelConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        char ch;
        System.out.print("Enter a character: ");
        ch = input.next().charAt(0);
        
        if (ch == 'a' || ch == 'A') {
            System.out.println("The Character is vowel.");
        }
        else if (ch == 'e' || ch == 'E') {
            System.out.println("The Character is vowel.");
        }
        else if (ch == 'i' || ch == 'I') {
            System.out.println("The Character is vowel.");
        }
        else if (ch == 'o' || ch == 'O') {
            System.out.println("The Character is vowel.");
        }
        else if (ch == 'u' || ch == 'U') {
            System.out.println("The Character is vowel.");
        }
        else {
            System.out.println("The character is Consonant.");
        }
        
        // This code could have been executed using logical or (||)
    }
    
}
