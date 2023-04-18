package com.mycompany.beginnerjava;

import java.util.Scanner;

public class JavaPalindromeDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num;
        System.out.print("Enter the number: ");
        num = input.nextInt();
        
        int temp, rem;
        int sum = 0;
        temp = num;
        
        while (temp != 0){
            rem = temp % 10;
            sum = sum * 10 + rem;
            temp = temp / 10;
        }
        if (num == sum) {
            System.out.println(num + " is a Palindrome number.");
        } else {
            System.out.println(num + " is not a palindrome number.");
        }
    }
}
