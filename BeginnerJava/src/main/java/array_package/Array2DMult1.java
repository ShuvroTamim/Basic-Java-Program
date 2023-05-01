package array_package;

import java.util.Scanner;

public class Array2DMult1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] mat1 = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        int[][] mat2 = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};

        int[][] mul_Mat = new int[3][3];

        System.out.println("The new Matrix is: ");

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
