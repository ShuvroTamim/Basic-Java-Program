package array_package;

import java.util.Scanner;

public class Array2DMult2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] mat1 = new int[3][3];
        int[][] mat2 = new int[3][3];
        
        System.out.print("Please Enter the entry of First Matrix: ");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                mat1[row][col] = input.nextInt();
            }
        }
        
        System.out.print("\nPlease Enter the entry of Second Matrix: ");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                mat2[row][col] = input.nextInt();
            }
        }
        
        System.out.println("\nFirst Matrix: ");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(mat1[row][col] + "\t");
            }
            System.out.println("");
        }
        
        System.out.println("\nSecond Matrix: ");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(mat2[row][col] + "\t");
            }
            System.out.println("");
        }

        int[][] mul_Mat = new int[3][3];

        System.out.println("\n\nThe new Matrix is: ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                //mul_Mat[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    mul_Mat[i][j] = mul_Mat[i][j] + mat1[i][k] * mat2[k][i];
                }
                System.out.print(mul_Mat[i][j] + "\t");
                mul_Mat[i][j] = 0;
            }
            System.out.println("");
        }
    }
}
