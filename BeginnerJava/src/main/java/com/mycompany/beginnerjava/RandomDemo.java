package com.mycompany.beginnerjava;

import java.util.Scanner;

public class RandomDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num;
        System.out.print("Enter the value of n: ");
        num = input.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            int rslt = num * i;
            System.out.println(num + " X " + i + " = " + rslt);
        }
    }
}
