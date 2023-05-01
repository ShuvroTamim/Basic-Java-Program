package array_package;

public class ArrayDemo6 {

    public static void main(String[] args) {
        //  Printing using for each loop
        int[] num = {10, 25, 34, 41, 55};
        int sum = 0;

        for (int x : num) {
            sum = sum + x;
        }
        System.out.println("The result of the sum: " + sum);
    }
}
