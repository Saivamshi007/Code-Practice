import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class HandlingArrayList {

    public static void main(String[] args) throws IOException {

        int testCase;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = bufferedReader.readLine().split(" ");

        testCase = Integer.parseInt(bufferedReader.readLine());

        for (String i : input) {
            System.out.println(i);
        }

        ArrayList<Integer>[] list = new ArrayList[testCase];

        for (int i = 0; i < testCase; i++) {
            String[] l = bufferedReader.readLine().split(" ");
            list[i] = new ArrayList<Integer>();

            for (int j = 1; j < l.length; j++) {
                int val = Integer.parseInt(l[j]);
                list[i].add(val);
            }

        }

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                System.out.println(list[i].get(j));
            }
        }

    }

}