package DP;

import java.util.ArrayList;

public class FibinocciMemo {
    public static void main(String[] args) {

        FibinocciMemo f = new FibinocciMemo();
        f.initialize();

        int n = 10;

        System.out.println(f.fib(10));

        // f.printlookup();

    }

    int max = 100;
    int NIL = -1;

    ArrayList<Integer> lookup = new ArrayList<Integer>();

    void initialize() {
        for (int i = 0; i < max; i++) {

            lookup.add(NIL);

        }
    }

    int fib(int n) {

        if (lookup.get(n) == NIL) {
            if (n <= 1) {
                lookup.add(n, n);
            } else {

                int result = fib(n - 1) + fib(n - 2);

                lookup.add(n, result);
            }
        }

        return lookup.get(n);

    }

    void printlookup() {

        for (int k : lookup) {
            System.out.println(k);
        }

    }

}