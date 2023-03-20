package com.mycompany.beginnerjava;
import java.util.Scanner; //Importing the Scanner Class

public class UserInput {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); // (Scanner) is a Class and (input) is an Object of the class
        
        // String Input
        System.out.print("Enter Your Name: ");
        String name = input.nextLine();
        System.out.println("My Name is: " + name);
        
        /*System.out.print("Enter Your Name: ");
        String nameVar = input.next();
        System.out.println("Name: " + nameVar);*/
        
        //Numerical Input
        System.out.print("Enter Your Age:");
        int age = input.nextInt();
        System.out.println("My Age is: " + age);
        
        System.out.print("Enter Your Salary: ");
        double salary = input.nextDouble();
        System.out.println("Salary: " + salary);
        
        //Boolean Input
        System.out.print("Enter a Boolean Value: ");
        boolean bool = input.nextBoolean();
        System.out.println("The Result is: " + bool);
    }
    
}
