package DP;

import java.util.*;

public class SubsetSum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] input = s.next().split("");

        int[] arr = new int[input.length];

        for (int i = 0; i < input.length; i++) {

            arr[i] = Integer.parseInt(input[i]);

        }

        int result = Subset(arr, 0, 0, arr.length, 6, 0);

        System.out.println("Count:" + result);

    }

    public static int Subset(int arr[], int sum, int index, int n, int target, int count) {

        if (n == 0) {
            if (sum == target) {

                count++;

            }

            return count;

        }

        count = Subset(arr, sum + arr[index], index + 1, n - 1, target, count);

        count = Subset(arr, sum, index + 1, n - 1, target, count);

        return count;

    }

}
