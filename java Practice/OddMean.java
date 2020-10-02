import java.io.*;

public class OddMean {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        int input[] = new int[n];

        for (int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(bf.readLine());

        }

        int sum = 0;
        int couunt = 0;

        for (int j = 1; j < n; j = j + 2) {

            sum += input[j];
            couunt++;

        }
        System.out.println(couunt);

        System.out.println("Result:" + sum / couunt);

    }
}
