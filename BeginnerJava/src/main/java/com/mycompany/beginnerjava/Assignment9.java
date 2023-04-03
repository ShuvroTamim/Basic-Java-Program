package com.mycompany.beginnerjava;

import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num;
        System.out.print("Press a number for langauge selection: ");
        num = input.nextInt();
        
        switch(num){
            case 1:
                System.out.println("Language Bangla is selected.");
                break;
            case 2:
                System.out.println("Language Hindi is selected.");
                break;
            case 3:
                System.out.println("Language Urdu is selected.");
                break;
            case 4:
                System.out.println("Language English is selected.");
                break;
            default:
                System.out.println("Please enter a correct number.");
        }
    }
}
