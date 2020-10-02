package DP;

import java.util.*;

import java.io.*;

public class NonRecSubset {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String word = s.next();

        int n = word.length();

        int temp = 0;

        int size = (int) (Math.pow(2, n));

        String[] arr = new String[size];

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                arr[temp] = word.substring(i, j + 1);
                temp++;

            }
        }

        for (String g : arr) {

            System.out.println(g);

        }

    }

}
