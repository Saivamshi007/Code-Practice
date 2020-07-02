import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class StringPolindrome {
    public static void main(final String[] args) throws IOException {
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();
        final Polindrome polindrome = new Polindrome();

        while (!input.equals("stop")) {
            polindrome.check(input);
            System.out.println(polindrome);
            input = bufferedReader.readLine();

        }

    }

    static class Polindrome {
        String answer;

        void check(final String str) {

            String Reverse = "";

            for (int i = str.length() - 1; i >= 0; i--) {

                Reverse += str.charAt(i);

            }

            if (Reverse.equals(str)) {

                answer = "Polindrome";

            } else {

                answer = "not Polindriome";

            }

        }

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return answer;
        }

    }
}
