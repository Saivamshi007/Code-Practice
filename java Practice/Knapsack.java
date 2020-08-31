import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import inheritance.b;

public class Knapsack {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int size;
        int[] wt, val;
        size = Integer.parseInt(bf.readLine());

        wt = new int[size];
        val = new int[size];

        String[] wtinput = bf.readLine().split(" ");
        String[] valinput = bf.readLine().split(" ");

        for (int i = 0; i < size; i++) {
            wt[i] = Integer.parseInt(wtinput[i]);
            val[i] = Integer.parseInt(valinput[i]);
        }

    }

}