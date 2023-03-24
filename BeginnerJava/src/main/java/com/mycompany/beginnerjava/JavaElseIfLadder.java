package com.mycompany.beginnerjava;

import java.util.Scanner;

public class JavaElseIfLadder {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter a Number: ");
        num = input.nextInt();
        
        if (num > 0) {
            System.out.println("This is a positive number.");
        } 
        else if (num < 0) {
            System.out.println("This is a negative number.");
        }
        else{
            System.out.println("The number is equal to 0.");
        }
        
    }
}
