public class SelectionSort {
    public static void main(final String[] args) {
        final int[] arr = { 5, 2, 9, 20, 1, 3 };

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }

            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for (int i : arr) {
            System.out.println(i);

        }

    }

}
