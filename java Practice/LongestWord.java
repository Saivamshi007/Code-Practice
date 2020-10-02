import java.io.*;

public class LongestWord {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] input = bf.readLine().split(" ");

        int[] length_array = new int[input.length];

        for (int i = 0; i < input.length; i++) {

            length_array[i] = input[i].length();

        }

        int max = length_array[0];
        int index = 0;

        for (int i = 0; i < length_array.length; i++) {
            if (max < length_array[i]) {
                max = length_array[i];
                index = i;
            }
        }

        System.out.println(input[index]);

    }

}
