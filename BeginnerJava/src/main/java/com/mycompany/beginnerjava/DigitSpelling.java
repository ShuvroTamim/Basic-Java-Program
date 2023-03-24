package com.mycompany.beginnerjava;

import java.util.Scanner;

public class DigitSpelling {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num;
        System.out.print("Enter any number from 0 to 9: ");
        num = input.nextInt();
        
        if (num == 0) {
            System.out.println("The number is Zero.");
        }
        else if (num == 1){
            System.out.println("The number is One.");
        }
        else if (num == 2){
            System.out.println("The number is Two.");
        }
        else if (num == 3){
            System.out.println("The number is Three.");
        }
        else if (num == 4){
            System.out.println("The number is Four.");
        }
        else if (num == 5){
            System.out.println("The number is Five.");
        }
        else if (num == 6){
            System.out.println("The number is Six.");
        }
        else if (num == 7){
            System.out.println("The number is Seven.");
        }
        else if (num == 8){
            System.out.println("The number is Eight.");
        }
        else if (num == 9){
            System.out.println("The number is Nine.");
        }
        else {
            System.out.println("Enter a number between 0 to 9 only.");
        }
    }
}
