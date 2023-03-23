package com.mycompany.beginnerjava;
import java.util.Scanner;

public class Assignment4 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int phonePrice, numberOfInstallments, installmentPerMonth;
        System.out.print("Enter the price of the Phone: ");
        phonePrice = input.nextInt();
        System.out.print("Enter the Number of Installments: ");
        numberOfInstallments = input.nextInt();
        
        installmentPerMonth = phonePrice / numberOfInstallments;
        System.out.println("Monthly Installment amount is: " + installmentPerMonth + " euros");
    }
    
}
