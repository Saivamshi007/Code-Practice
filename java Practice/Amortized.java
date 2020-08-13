import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Amortized {
    public static void main(final String[] args) throws NumberFormatException, IOException {

        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        final DynamicArray dynamicArray = new DynamicArray();
        int input = Integer.parseInt(bufferedReader.readLine());

        while (input != 0) {
            if (input < 0) {
                dynamicArray.delete(input);
            } else {
                dynamicArray.add(input);

            }
            input = Integer.parseInt(bufferedReader.readLine());
        }

        System.out.println(dynamicArray);

    }

    static class DynamicArray {
        private int size = 1, counter = 0;
        private int a[] = new int[size];

        public void add(final int n) {

            if (counter == size) {
                size = 2 * size;
                System.out.println("Array size doubled");
                final int temp[] = new int[size];
                for (int i = 0; i < a.length; i++) {
                    temp[i] = a[i];
                }

                a = temp;
            }

            a[counter] = n;
            counter++;

        }

        public void delete(int n) {

            if (counter > 0) {
                counter--;
                a[counter] = 0;

            }

        }

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return "Dynamic Array" + " " + "size" + size + " " + "Array" + Arrays.toString(a) + "  Counter" + counter;
        }

    }

}