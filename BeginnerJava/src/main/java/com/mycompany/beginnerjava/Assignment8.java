package com.mycompany.beginnerjava;

import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        char ch1, ch2;
        System.out.print("Have you completed your masters? Y/N: ");
        ch1 = input.next().charAt(0);
        
        System.out.print("Are you fluent in English? Y/N: ");
        ch2 = input.next().charAt(0);
        
        if ((ch1 == 'Y' || ch1 == 'y') && (ch2 == 'Y' || ch2 == 'y')) {
            System.out.println("You are eligible for the job interview.");
        }
        else if ((ch1 == 'N' || ch1 == 'n') && (ch2 == 'N' || ch2 == 'N')) {
            System.out.println("You are not eligible for the job interview.");
        }
        else if ((ch1 == 'Y' || ch1 == 'y') && (ch2 == 'N' || ch2 == 'n')) {
            System.out.println("You are not eligible for the job interview."
                    + "Increase your english fluency.");
        }
        else if ((ch1 == 'N' || ch1 == 'n') && (ch2 == 'Y' || ch2 == 'y')) {
            System.out.println("You are not eligible for the job interview."
                    + "Complete your masters Degree.");
        }
        else {
            System.out.println("Please only type Y/y if yes or type N/n if no.");
        }
    }
}
