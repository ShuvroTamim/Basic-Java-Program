package array_package;

import java.util.Scanner;

public class ArrayDemo4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = new String[5];
        // OR
        //String[] names = {"Tamim", "Mehedi", "Shuvo", "Shofiq", "Mim"};
//        names[0] = "Tamim";
//        names[1] = "Mehedi";
//        names[2] = "Shuvo";
//        names[3] = "Shofiq";
//        names[4] = "Mim";

        System.out.println("Please Enter the names: ");
        for (int i = 0; i < names.length; i++) {
            names[i] = input.nextLine();
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println(i + 1 + " name is: " + names[i]);
        }
    }
}
