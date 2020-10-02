import java.io.*;
import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] word1 = bf.readLine().split("");
        String[] word2 = bf.readLine().split("");

        Arrays.sort(word1);
        Arrays.sort(word2);

        String reword1 = "";
        String reword2 = "";

        if (word1.length != word2.length) {
            System.out.println("Not Anagram");
        } else {

            for (int i = 0; i < word1.length; i++) {

                reword1 += word1[i];

            }

            for (int j = 0; j < word2.length; j++) {

                reword2 += word2[j];
            }

            if (reword1.equalsIgnoreCase(reword2)) {
                System.out.println("Anagram");
            } else {

                System.out.println("not Anagram");

            }

        }
    }

}
