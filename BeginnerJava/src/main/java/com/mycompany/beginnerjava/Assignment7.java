package com.mycompany.beginnerjava;

import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        char ch;
        System.out.println("Dou you love java?");
        System.out.print("Type Y/y if yes or type N/n if no: ");
        ch = input.next().charAt(0);
        
        if (ch == 'Y' || ch == 'y') {
            System.out.println("You are a java lover.");
        }else if (ch == 'N' || ch == 'n') {
            System.out.println("You are not a java lover.");
        }else {
            System.out.println("Please only type Y/y if yes or type N/n if no.");
        }
    }
}
