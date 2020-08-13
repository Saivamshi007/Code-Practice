public class Fibbinoci {

    public static void main(String[] args) {
        int a = 0, b = 1, n = 9;

        int i = 0;

        int c;

        while (i < n) {

            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
            i++;

        }

    }

}