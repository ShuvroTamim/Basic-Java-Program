package com.mycompany.beginnerjava;

import java.util.Scanner;

public class JavaRevDigit {
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
        System.out.println("The reverse of the "+num+" is: "+sum);
    }
}
