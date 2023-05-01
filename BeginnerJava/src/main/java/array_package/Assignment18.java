package array_package;

import java.util.Scanner;

public class Assignment18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] wkdays = new String[7];
        wkdays[0] = "Monday";
        wkdays[1] = "Tuesday";
        wkdays[2] = "Wednesday";
        wkdays[3] = "Thursday";
        wkdays[4] = "Friday";
        wkdays[5] = "Saturday";
        wkdays[6] = "Sunday";

        int n;
        System.out.print("Please Enter the day number (1-7): ");
        n = input.nextInt();

        if (n == 1) {
            System.out.println(wkdays[0]);
        } else if (n == 2) {
            System.out.println("The day is: " + wkdays[1]);
        } else if (n == 3) {
            System.out.println("The day is: " + wkdays[2]);
        } else if (n == 4) {
            System.out.println("The day is: " + wkdays[3]);
        } else if (n == 5) {
            System.out.println("The day is: " + wkdays[4]);
        } else if (n == 6) {
            System.out.println("The day is: " + wkdays[5]);
        } else if (n == 7) {
            System.out.println("The day is: " + wkdays[6]);
        } else {
            System.out.println("Please enter a valid number.");
        }
    }
}
