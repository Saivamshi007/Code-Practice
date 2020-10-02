package DP;

import java.util.*;

public class JosephusProblem {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();

        System.out.println(Sol(n, k));

    }

    public static int Sol(int n, int k) {

        if (n == 1) {
            return 1;
        } else {

            return (Sol(n - 1, k) + k - 1) % n + 1;
        }

    }

}
