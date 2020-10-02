import java.io.*;

public class NumberRemoval {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine();

        input = input.replaceAll("[0123456789]", "");

        System.out.println(input);

        // there is another in which i can split the input into word array, check them
        // and remove
        // numerics from the array but the above method is fast and clean

    }

}
