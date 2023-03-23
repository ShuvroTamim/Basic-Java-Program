package com.mycompany.beginnerjava;

public class JavaIncDec {
    
    public static void main(String[] args) {
        
        int x = 25 , y;
        
        y = --x; //Pree Decrement
        System.out.println("Y= " + y); //Will Print 24 after Deccrement
        
        y = x--; //Post Decrement
        System.out.println("Y= " + y); //Will Print 24 before Deccrement
        
        y = x; //No Increment or Deccrement
        System.out.println("Y= " + y); //Will Print 23
        
        y = ++x; //Pree Increment
        System.out.println("Y= " + y); //Will Print 24 after Decrement
        
        y = x++; //Post Increment
        System.out.println("Y= " + y); //Will print 15 as last value is 15.
        
        y = x; //No Increment or Deccrement
        System.out.println("Y= " + y); //Will Print 25
    }
    
}
