package com.mycompany.beginnerjava;

public class JavaForLoop {
    public static void main(String[] args) {
        int i, j;
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        
        for (i = 0; i < 5; i++) {
            System.out.println("\nOuter loop: " + i + "\n");
            
            for (j = 0; j < 2; j++) {
                System.out.println("Inner loop: " + j);
            }
        }
        
        for (String k : cars) {  // For-Each loop.
            System.out.println(k);
        }
    }
}
