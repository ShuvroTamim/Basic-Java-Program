package array_package;

public class ArrayDemo1 {

    public static void main(String[] args) {
        int[] num;  // Array Declaration
        num = new int[5];   // Array Creating means providing array size
        // or
        //int[] num = new int[5]; // Array Declaration & Creating
        // Now initialization or assigning the value in th index.
        num[0] = 10;
        num[1] = 4;
        num[2] = 8;
        num[3] = 9;
        num[4] = 7;
        System.out.println("The output of Index 3 is: " + num[3]);

        int len = num.length;
        System.out.println("The size of the array: " + len);

        int sum = num[0] + num[1] + num[2] + num[3] + num[4];
        System.out.println("The sum of the array index value: " + sum);
    }
}
