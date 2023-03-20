package com.mycompany.firstjavacode;

public class TypeCasting {
    
    public static void main(String[] args) {
        int myInt1 = 9;
        double myDouble1 = myInt1; // Automatic Casting: int to double.
        /* Widening Casting is done automatically when passing small
        size type to large size type. */ 
        System.out.println(myInt1);
        System.out.println(myDouble1);
        
        double myDouble2 = 9.78d;
        int myInt2 = (int)myDouble2; // Manual Casting: double to int.
        /* Narrowing Casting is done manually when passing large
        size type to small size type. */
        System.out.println(myDouble2);
        System.out.println(myInt2);
    }
    
}
