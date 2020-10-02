import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReverse {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine();

        CharRev(input);

    }

    public static void Reverse(String str) {
        String[] input = str.split("");

        String rev = "";
        for (int i = input.length - 1; i >= 0; i--) {

            rev += input[i];

        }

        System.out.println(rev);

    }

    public static void CharRev(String str) {

        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {

            rev += str.charAt(i);

        }

        System.out.println(rev);
    }

}
