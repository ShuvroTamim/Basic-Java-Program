package com.mycompany.beginnerjava;
import java.util.Scanner;

public class ArithmaticDemo {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num1, num2, result;
        
        System.out.print("Enter your First number: ");
        num1 = input.nextInt();
        System.out.print("Enter your Second number: ");
        num2 = input.nextInt();
        
        result = num1 + num2;
        System.out.println("Sum is= " + result);
        
        result = num1 - num2;
        System.out.println("Subtraction is= " + result);
        
        result = num1 * num2;
        System.out.println("Multiplication is= " + result);
        
        double result1 = (double)num1 / num2;   //Used TypeCasting
        System.out.println("Division is= " + result1);
        
        result = num1 % num2;
        System.out.println("Reminder is= " + result);
        
    }
    
}
