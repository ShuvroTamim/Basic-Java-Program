package array_package;

import java.util.Scanner;

public class Array2D_Demo1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] num = new int[2][3];    //  Array declaring and Creating
        //  Array initialization
        num[0][0] = 10;
        num[0][1] = 20;
        num[0][2] = 30;
        num[1][0] = 40;
        num[1][1] = 50;
        num[1][2] = 60;

        System.out.println(num[0][0]);
        System.out.println(num[0][1]);
        System.out.println(num[0][2]);
        System.out.println(num[1][0]);
        System.out.println(num[1][1]);
        System.out.println(num[1][2]);
    }
}
