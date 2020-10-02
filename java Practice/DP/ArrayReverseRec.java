package DP;

public class ArrayReverseRec {

    public static int[] Reverse(int[] arr, int i, int j) {

        if (i < j) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            Reverse(arr, i + 1, j - 1);

        }

        return arr;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length - 1;
        int[] output = new int[n];
        output = Reverse(arr, 0, n);

        for (int Out : output) {
            System.out.println(Out);
        }

    }
}
