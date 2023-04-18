package com.mycompany.beginnerjava;

import java.util.Scanner;

public class JavaSumOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num, rem;
        int sum = 0;
        
        System.out.print("Enter the number: ");
        num = input.nextInt();
        
        int temp = num;
        
        while(temp != 0){
            rem = temp % 10;
            sum = sum + rem;
            temp = temp / 10;
        }
        System.out.println("The sum of the " + num + " is: " + sum);
    }
}
