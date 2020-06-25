import java.io.*;

class ReverseString {
    public static void main(final String[] args) throws IOException {

        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        final String input = bufferedReader.readLine();

        final Reverse r = new Reverse();
        r.rev(input);

    }

    static class Reverse {

        String s = "";

        void rev(final String str) {

            for (int i = str.length() - 1; i >= 0; i--) {
                s = s + str.charAt(i);
            }

            System.out.println(s);

        }

    }

}