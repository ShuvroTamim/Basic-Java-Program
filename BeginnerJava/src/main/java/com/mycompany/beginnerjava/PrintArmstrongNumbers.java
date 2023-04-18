package com.mycompany.beginnerjava;

import java.util.Scanner;

public class PrintArmstrongNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int m, n;
        System.out.print("Enther the starting number: ");
        m = input.nextInt();
        System.out.print("Enther the ending number: ");
        n = input.nextInt();
        
        int temp, sum = 0, rem, count = 0;
        
        System.out.print("Armstrong numbers are: ");
        for (int i = m; i <= n; i++) {
            temp = i;
            while(temp != 0){
             rem = temp % 10;
             sum = sum + rem*rem*rem;
             temp = temp / 10;
            }
            if (sum == i) {
                System.out.print(sum + " ");
                count++;
            }
            sum = 0;
        }
        System.out.println("\nTotal armstrong numbers are: " + count);
    }
}
