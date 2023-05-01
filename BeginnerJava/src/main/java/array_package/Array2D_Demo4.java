package array_package;

import java.util.Scanner;

public class Array2D_Demo4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] fMat = new int[2][3];
        int[][] sMat = new int[2][3];

        System.out.print("Please enter the value of first Matrinx: ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                fMat[row][col] = input.nextInt();
            }
        }

        System.out.println("First Matrix: ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(fMat[row][col] + " ");
            }
            System.out.println("");
        }

        System.out.print("\nPlease enter the value of Second Matrinx: ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                sMat[row][col] = input.nextInt();
            }
        }

        System.out.println("Second Matrix: ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(sMat[row][col] + " ");
            }
            System.out.println("");
        }
    }
}
