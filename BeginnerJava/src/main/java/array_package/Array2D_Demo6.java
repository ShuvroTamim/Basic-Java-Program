package array_package;

import java.util.Scanner;

public class Array2D_Demo6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] fMat = new int[2][3];
        int[][] sMat = new int[2][3];
        int[][] sum = new int[2][3];

        System.out.println("Please enter the value of first Matrinx: ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("firstMatrix[%d][%d]= ", row, col);
                fMat[row][col] = input.nextInt();
            }
        }

        System.out.println("\nPlease enter the value of Second Matrinx: ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("SecondMatrix[%d][%d]= ", row, col);
                sMat[row][col] = input.nextInt();
            }
        }

        System.out.println("\nFirst Matrix: ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(fMat[row][col] + " ");
            }
            System.out.println("");
        }

        System.out.println("\nSecond Matrix: ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(sMat[row][col] + " ");
            }
            System.out.println("");
        }
        
        //Now adding fMAt & sMat
        System.out.println("\nThe new matrix is: ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                sum[row][col] = fMat[row][col] + sMat[row][col];
                System.out.print(sum[row][col] + " ");
            }
            System.out.println("");
        }
        
        
    }
}
