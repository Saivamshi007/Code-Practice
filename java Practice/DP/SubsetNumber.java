package DP;

import java.util.*;

public class SubsetNumber {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String[] input = s.next().split("");
        ArrayList<Integer> list = new ArrayList<Integer>();

        int[] arr = new int[input.length];

        for (int i = 0; i < input.length; i++) {

            arr[i] = Integer.parseInt(input[i]);

        }
        ArrayList<Integer> result = Subset(arr, 0, 0, arr.length, list);

        for (int output : result) {
            System.out.println(output);
        }

        cout(list, 6);

    }

    public static void cout(ArrayList<Integer> list, int target) {

        int count = 0;

        for (int i = 0; i < list.size(); i++) {

            if (target == list.get(i)) {
                count++;
            }

        }

        System.out.println("Count is:" + count);

    }

    public static ArrayList<Integer> Subset(int arr[], int sum, int index, int n, ArrayList<Integer> list) {

        if (n == 0) {

            list.add(sum);
            return list;

        }

        Subset(arr, sum + arr[index], index + 1, n - 1, list);

        Subset(arr, sum, index + 1, n - 1, list);

        return list;

    }

}
