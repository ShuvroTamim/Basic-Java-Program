
package com.mycompany.firstjavacode;

public class DataVariable {
    
    public static void main(String[] args) {
        int myNum1 = 15;
        myNum1 = 20; //Value of myNum is now 20.
        final int myNum2 = 30;
//        myNum2 = 35; // will generate an error: cannot assign a value to a final variable
        float myNum3 = 35e3f;
        double myNum4 = 12E4d;
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println("First Number= " + myNum1);
        System.out.println("Second Number= " + myNum2);
        System.out.println(myNum3);
        System.out.println(myNum4);
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);
    }
    
}
