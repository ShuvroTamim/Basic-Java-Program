package array_package;

import java.util.Scanner;

public class ArrayDemo2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] num;
        num = new double[5];
        double sum = 0;
        System.out.print("Please Enter five numbers: ");
//        num[0] = input.nextDouble();
//        num[1] = input.nextDouble();
//        num[2] = input.nextDouble();
//        num[3] = input.nextDouble();
//        num[4] = input.nextDouble();

        for (int i = 0; i < 5; i++) {  //   i<num.length
            num[i] = input.nextDouble();
        }

        //double sum = num[0]+num[1]+num[2]+num[3]+num[4];
        for (int i = 0; i < num.length; i++) {  //  i<5 same
            sum = sum + num[i];
        }
        System.out.println("The result of the sum is: " + sum);

        double avg = sum / num.length;
        System.out.println("The result of the average is: " + avg);

        double max = num[0];

        for (int i = 1; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
            } else {
                continue;
            }
        }
        System.out.println("Maximum value is: " + max);
    }
}
