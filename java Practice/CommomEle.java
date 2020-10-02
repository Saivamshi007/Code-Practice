import java.io.*;

public class CommomEle {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Length of 1st array");
        int input1_len = Integer.parseInt(bf.readLine());
        System.out.println("Enter lenght of 2nd Array");
        int input2_len = Integer.parseInt(bf.readLine());

        String[] input1_Array = new String[input1_len];
        String[] input2_Array = new String[input2_len];

        for (int i = 0; i < input1_len; i++) {

            input1_Array[i] = bf.readLine();

        }

        for (int i = 0; i < input2_len; i++) {

            input2_Array[i] = bf.readLine();

        }

        System.out.println("Common elements");

        for (int i = 0; i < input1_len; i++) {

            for (int j = 0; j < input2_len; j++) {

                if (input1_Array[i].equals(input2_Array[j])) {
                    System.out.println(input1_Array[i]);
                }
            }

        }

    }

}
