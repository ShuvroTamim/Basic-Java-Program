package com.mycompany.beginnerjava;

import java.util.Scanner;

public class JavaTernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num1, num2, large;
        System.out.print("Enter first number: ");
        num1 = input.nextInt();
        System.out.print("Enter second number: ");
        num2 = input.nextInt();
        
        large = (num1 > num2)?num1:num2; // (Condition) ? ExpressionTrue : ExpressionFalse
        
        System.out.println("The large number is: " + large);
    }
}
