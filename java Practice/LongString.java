import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class LongString {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String largest = bf.readLine();
        int n = Integer.parseInt(bf.readLine());

        String[] small = new String[n];

        for (int i = 0; i < n; i++) {
            small[i] = bf.readLine();

        }

        String smallAdds = "";

        for (int i = 0; i < n; i++) {
            smallAdds += small[i];
        }

        if (largest.length() < smallAdds.length()) {
            System.out.println("NO");
        } else {

            int count = 0;

            for (int i = 0; i < n; i++) {
                String[] tokens = largest.split("(?<=\\G.{" + small[i].length() + "})");
                for (int j = 0; j < tokens.length; j++) {

                    final char[] smallStirng = small[i].toCharArray();

                    final char[] largesub = tokens[j].toCharArray();
                    Arrays.sort(smallStirng);
                    Arrays.sort(largesub);

                    if (largesub.equals(smallStirng)) {
                        count++;

                    }

                }

            }

            if (count > n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }

    }

}