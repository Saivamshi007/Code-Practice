package DP;

import java.util.*;

public class RotatingArray {

    public static void main(String[] args) {

        int[] array = { 5, 8, 10, 12, 15 };

        Scanner s = new Scanner(System.in);
        int d = s.nextInt();
        int low = 0, high = array.length - 1, n = array.length;

        while (low < d) {

            int temp;

            int k = 0;

            temp = array[0];
            for (int j = 0; j < array.length - 1; j++) {

                array[j] = array[k + 1];
                k++;

            }

            array[high] = temp;
            low++;

        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

}
