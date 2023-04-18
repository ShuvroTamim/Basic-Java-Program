package com.mycompany.beginnerjava;

import java.util.Scanner;

public class JavaArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num;
        System.out.print("Enther the number: ");
        num = input.nextInt();
         int temp, sum = 0, rem;
         temp = num;
         
         while(temp != 0){
             rem = temp % 10;
             sum = sum + rem*rem*rem;
             temp = temp / 10;
         }
         if (sum == num) {
             System.out.println(sum + " is an armstrong number.");
        } else {
             System.out.println(sum + " is not an armstrong number.");
        }
    }
}
