package string_package;

import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args){
        //Scanner input = new Scanner(System.in);
        
        String fName = "Tamim ";
        String lName = "Ahmed";
        
        //String fullName = fName + lName;
        String fullName = fName.concat(lName);
        System.out.println("Full Name: " + fullName);
        
        String upName = fullName.toUpperCase();
        System.out.println("Full Name in Uppercase: " + upName);
        String lowName = fullName.toLowerCase();
        System.out.println("Full Name in Lowercase: " + lowName);
        
        boolean start = fullName.startsWith("T");
        System.out.println("Result: " + start);
        boolean end = fullName.endsWith("T");
        System.out.println("Result: " + end);
        
        String[] name = {"Tamim", "Mehedi", "Shofiq", "Shuvo", "Mim"};
        for (String x : name) {
            System.out.println(x);
        }
        // Another way...
        for (int i = 0; i < 5; i++) {
            System.out.println("Name is: " + name[i]);
        }
    }
}
