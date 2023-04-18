package com.mycompany.beginnerjava;

import java.util.Scanner;

public class UserNameAndPassCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String sourceUser = "Tamim";
        int sourcePass = 12345;
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter your user Name: ");
            String user = input.next();
            
            System.out.print("Enter your user Name: ");
            int pass = input.nextInt();
            
            if ((user.equals(sourceUser)) && (pass == sourcePass)) {
                System.out.println("You are welcome.");
                break;
            } else {
                System.out.println("Please try again.");
            }
            System.out.println("");
        }
    }
}
