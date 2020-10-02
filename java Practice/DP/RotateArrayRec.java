package DP;

public class RotateArrayRec {

    static void Reverse(int[] arr, int i, int j) {

        if (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            Reverse(arr, i + 1, j - 1);

        }

        return;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        int d = 2;
        int n = arr.length;
        int[] output = new int[n];

        Reverse(arr, 0, d - 1);
        Reverse(arr, d, n - 1);
        Reverse(arr, 0, n - 1);

        for (int Out : arr) {
            System.out.println(Out);
        }

    }

}
