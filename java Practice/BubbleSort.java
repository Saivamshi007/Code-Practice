public class BubbleSort {
    public static void main(String[] args) {

        Bubble bubble = new Bubble();

        int[] arr = { 2, 5, 3, 8, 9, 6, 4 }, output;

        output = bubble.Sort(arr);
        for (int i : output) {

            System.out.println(i);

        }

    }

    static class Bubble {
        int[] Sort(final int[] arr) {

            int temp;

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {

                    if (arr[j] < arr[j + 1]) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;

                    }

                }
            }

            return arr;

        }
    }

}