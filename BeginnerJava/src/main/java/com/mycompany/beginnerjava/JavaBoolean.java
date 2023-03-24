package com.mycompany.beginnerjava;

public class JavaBoolean {
    
    public static void main(String[] args) {
        
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);
        
        //Boolean Expression example
        
        int x = 10;
        int y = 9;
        System.out.println(x>y); //Returns true as x is greater than y
        
        int z = 15;
        System.out.println(z == 10); //Returns false as z is not equal to 15
        
        //Real life example
        int myAge = 7;
        int votingAge = 18;
        System.out.println(myAge >= votingAge);
        
        if (myAge >= votingAge) {
            System.out.println("You can vote this Year.");
        }
        else
            System.out.println("You can't vote this Year.");
    }
    
}
