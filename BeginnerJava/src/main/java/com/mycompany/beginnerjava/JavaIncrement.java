package com.mycompany.beginnerjava;

public class JavaIncrement {
    
    public static void main(String[] args) {
        int x1, x2, y1, y2;
        x1 = 13;
        x2 = 14;
        
        y1 = x1++; //Post Increment
        System.out.println("Y1= " + y1);
        
        y1 = x1;
        System.out.println("Y1= " + y1);
        
        y2 = ++x2; //Pree Increment
        System.out.println("Y2= " + y2); //Will Print 15 after increment
        
        y2 = x2;
        System.out.println("Y2= " + y2); //Will print 15 as last value is 15.
    }
    
}
