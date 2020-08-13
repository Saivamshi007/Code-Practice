import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class HCF {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of the array");
        int n = Integer.parseInt(bf.readLine());

        int[] input = new int[n];

        for (int i = 0; i < n; i++) {

            input[i] = Integer.parseInt(bf.readLine());

        }

        int a = 2;

        Arrays.sort(input);

        ArrayList<Integer> list = new ArrayList<>();

        while (a <= input[0]) {

            int count = 0;

            for (int i = 0; i < n; i++) {
                if (input[i] % a == 0) {
                    count++;

                }
            }

            if (count == n) {
                list.add(a);
            }

            a++;

        }

        System.out.println("factors");

        for (int k : list) {

            System.out.println(k);

        }

        System.out.println("HCF: " + list.get(list.size() - 1));

    }

}