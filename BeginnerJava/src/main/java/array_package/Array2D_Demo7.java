package array_package;

import java.util.Scanner;

public class Array2D_Demo7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] mat = new int[3][3];
        
        int sum = 0, sumOfUpTr = 0, sumOfLowTr = 0;
        
        System.out.print("Please Enter the entry of Matrix: ");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                mat[row][col] = input.nextInt();
            }
        }
        
        System.out.println("\nThe Matrix is: ");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(mat[row][col] + "\t");
            }
            System.out.println("");
        }
        
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat.length; col++) {
                if (row == col) {
                    sum = sum + mat[row][col];
                }
                
                if (row < col) {
                    sumOfUpTr = sumOfUpTr + mat[row][col];
                }
                
                if (row > col) {
                    sumOfLowTr = sumOfLowTr + mat[row][col];
                }
            }
        }
        System.out.println("\n\nThe sum of Diagonal entry is: " + sum);
        System.out.println("The sum of Upper Triangle entry is: " + sumOfUpTr);
        System.out.println("The sum of lower Triangle entry is: " + sumOfLowTr);
    }
}
