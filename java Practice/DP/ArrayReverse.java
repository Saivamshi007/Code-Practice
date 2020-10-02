package DP;

import java.util.*;

public class ArrayReverse {

    public static void main(String[] args) {

        int[] array = { 8, 10, 6, 5 };

        int n = array.length, low = 0, high = array.length - 1;

        while (low < high) {

            int temp;

            temp = array[low];
            array[low] = array[high];
            array[high] = temp;

            low++;
            high--;

        }

        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }

    }

    public static void Swap(int a, int b) {

        int temp;

        temp = a;
        a = b;
        b = temp;

    }
}
