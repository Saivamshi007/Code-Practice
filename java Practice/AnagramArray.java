import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;

import sun.security.util.Length;

public class AnagramArray {

    public static void main(final String[] args) throws IOException {

        final String[] input = new String[6];
        int i = 0;
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (i < 6) {
            input[i] = bufferedReader.readLine();
            i++;
        }

        final String[] out = Anagram(input);

        for (final String var : out) {
            System.out.println(var);
        }

    }

    static String[] Anagram(final String[] anagram) {

        final String[] returnArray = new String[anagram.length];

        System.out.println(anagram.length);

        int f = 0;

        final Dictionary dic = new Hashtable();

        for (int i = 0; i < anagram.length; i++) {
            for (int j = i + 1; j < anagram.length; j++) {
                if (anagram[i].length() != anagram[j].length()) {

                } else if (anagram[i].equals(anagram[j])) {

                    returnArray[f] = anagram[i];
                    anagram[i] = "out";
                    f++;

                } else {

                    final String[] splitArray = anagram[i].split("");
                    for (final String a : splitArray) {
                    }

                }
            }
        }

        return returnArray;

    }

}
