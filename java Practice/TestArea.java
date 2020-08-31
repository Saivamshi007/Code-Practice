import java.io.File;
import java.util.Arrays;

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

        int a = 0, b = 0;

        System.out.println(--a);
        System.out.println(b--);

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