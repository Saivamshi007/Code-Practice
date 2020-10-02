import java.io.File;
import java.util.Arrays;
import java.util.*;

class TestArea {
    public static void main(String[] args) {

        // boolean a = prime(10, 10 / 2);

        // System.out.println(a);

        // int t[][] = new int[6][6];

        // for (int[] n : t) {
        // Arrays.fill(n, -1);
        // }

        // int count = 0;

        // for (int i = 0; i < 6; i++) {
        // for (int j = 0; j < 6; j++) {
        // System.out.println(t[i][j]);
        // count++;
        // }
        // }

        // Scanner s = new Scanner(System.in);

        // int n = s.nextInt();

        // int result = fact(n, 1);

        // System.out.println(result);

        String s = "sunny";

        for (int i = 0; i < 4; i++) {

            System.out.println(s.substring(1));

        }

    }

    public static int printNum(int n) {

        if (n == 0) {
            return 0;

        }

        System.out.println(n);

        return printNum(n - 1);

    }

    public static int fact(int n, int res) {

        if (n == 0 || n == 1) {
            return res;
        }

        return fact(n - 1, res * n);
    }

    public static boolean prime(int i, int a) {
        if (i == 1) {
            return false;
        }
        if (i % a == 0) {
            return true;
        } else {
            return prime(i, i - 1);
        }
    }
}