package array_package;

import java.util.Scanner;

public class ArrayAssignment18_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] wkdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int n;
        System.out.print("Please Enter the day number (1-7): ");
        n = input.nextInt();

        for (int i = 0; i < wkdays.length; i++) {
            if (n == i + 1) {
                System.out.println("The day is: " + wkdays[i]);
            }
        }
    }
}
