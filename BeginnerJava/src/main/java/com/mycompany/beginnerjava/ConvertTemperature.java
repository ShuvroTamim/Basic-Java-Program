package com.mycompany.beginnerjava;

import java.util.Scanner;

public class ConvertTemperature {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Converting Temperature from Celcious to Farentheight
        double tc, tf;
        System.out.print("Temperature in Farenheight Scale: ");
        tc = input.nextDouble();
        tf = (tc*9)/5+32;
        System.out.println("Temperature in Farenheight Scale: " + tf);
    }
    
}
