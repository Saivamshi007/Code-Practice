public class RecursiveFibinocci {

    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            System.out.println(fibinocci(i));

        }

    }

    static int fibinocci(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 0) {

            return 0;

        } else {
            return fibinocci(n - 1) + fibinocci(n - 2);
        }

    }

}