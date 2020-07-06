public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = { 3, 5, 1, 2, 20, 10 };
        int j;

        for (int i = 1; i < arr.length; i++) {
            int CurrentVal = arr[i];
            for (j = i - 1; j >= 0 && arr[j] > CurrentVal; j--) {

                arr[j + 1] = arr[j];

            }

            arr[j + 1] = CurrentVal;
        }

        for (int i : arr) {
            System.out.println(i);

        }

    }

}