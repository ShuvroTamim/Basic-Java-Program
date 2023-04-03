package com.mycompany.beginnerjava;

import java.util.Scanner;

public class JavaWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int i = 0, num;
        System.out.print("Enter a number: ");
        num = input.nextInt();
        
        while(i < num){
            System.out.println(i);
            i++;
        }
    }
}
