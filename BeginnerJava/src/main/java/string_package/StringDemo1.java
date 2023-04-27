package string_package;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        
        String s1 = "Tamim Ahmed";
        String s2 = new String("Tamim Ahmed");
        
        System.out.println(s1);
        System.out.println(s2);
        
        int len1 = s1.length();
        System.out.println("Length of s1= "+len1);
        int len2 = s2.length();
        System.out.println("Length of s2= "+len2);
        
        boolean con = s1.contains("Tan");
        System.out.println(con);
        boolean emp = s1.isEmpty();
        System.out.println("s1 is empty: "+emp);
        
        if (s1.equals(s2)) {
            System.out.println("Equal.");
        } else {
            System.out.println("Not equal.");
        }
        
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Equal.");
        } else {
            System.out.println("Not equal.");
        }
        
        if (s1.contains("Tamim")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
