package array_package;

import java.util.Scanner;

public class Array2D_Demo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] num = new int[2][3];
        
        System.out.print("Please enter the value in the Array: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                num[i][j] = input.nextInt();
            }
        }
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(num[i][j] + "  ");
            }
            System.out.println("");
        }
    }
}
