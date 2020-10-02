import java.util.*;

public class CuttingRope {

    public static void main(String[] args) {

        int res = getMax(23, 9, 11, 12);

        System.out.println(res);

    }

    public static int getMax(int n, int a, int b, int c) {

        if (n < 0)
            return -1;

        if (n == 0)
            return 0;

        int ca = getMax(n - a, a, b, c);
        int cb = getMax(n - b, a, b, c);
        int cc = getMax(n - c, a, b, c);

        int res = MAX(ca, cb, cc);

        if (res == -1) {
            return -1;

        } else {
            return res + 1;
        }

    }

    public static int MAX(int a, int b, int c) {

        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

}
