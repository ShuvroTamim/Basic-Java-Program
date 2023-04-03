package com.mycompany.beginnerjava;

import java.util.Scanner;

public class JavaPrimeNumber2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num, count = 0;
        System.out.print("Enter the number: ");
        num = input.nextInt();
        
        if (num == 0 || num == 1) {
            System.out.println(num + " is not a prime number.");
        } else {
            for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println(num + " is a prime number.");
        }
        else
            System.out.println(num + " is not a prime number.");
        }
    }
}
