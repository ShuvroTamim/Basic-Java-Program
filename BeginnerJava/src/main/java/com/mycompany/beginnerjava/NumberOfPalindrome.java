package com.mycompany.beginnerjava;

import java.util.Scanner;

public class NumberOfPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int m, n;
        System.out.print("Enter the starting number: ");
        m = input.nextInt();
        
        System.out.print("Enter the ending number: ");
        n = input.nextInt();
        
        int temp, rem, sum = 0 , count = 0;
        
        System.out.print("The palindrome numbers are: ");
        for (int i = m; i <= n; i++) {
            temp = i;
            while (temp != 0) {
                rem = temp % 10;
                sum = sum * 10 + rem;
                temp = temp / 10;
            }
            
            if (sum == i) {
                System.out.print(sum + " ");
                count++;
            }
            sum = 0;    //The value sum has changed. So made it 0 again.
        }
        System.out.println("\nTotal palindrome numbers are: " + count);
    }
}
