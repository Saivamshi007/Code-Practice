public class FibinocciRecursion {
    public static void main(String[] args) {

        FibinocciRecursion f = new FibinocciRecursion();

        int n = 5;
        /*
         * for (int i = 0; i <= n; i++) { System.out.println(f.fib(i));
         * 
         * }
         */

        System.out.println(f.fib(10));

    }

    int fib(int n) {

        if (n <= 1) {
            return n;
        } else {

            return fib(n - 1) + fib(n - 2);
        }

    }

}