import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class ContinueString {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int test = Integer.parseInt(bf.readLine());

        ArrayList<String> input = new ArrayList<String>();

        for (int i = 0; i < test; i++) {
            input.add((bf.readLine()));
        }

        int i = 0;
        while (i < test) {

            String[] single = input.get(i).split("");

            ArrayList<String> singleList = new ArrayList<String>();

            for (int k = 0; k < single.length; k++) {
                singleList.add(k, single[k]);
            }

            for (int j = 0; j < singleList.size() - 1; j++) {

                if (singleList.get(j).equals(singleList.get(j + 1))) {
                    singleList.remove(j);
                }

            }

            String s = "";

            for (String w : singleList) {

                s += w;

            }

            System.out.println(s);

            i++;
        }

    }

}