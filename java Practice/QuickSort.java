public class QuickSort {
    public static void main(final String args[]) {

        final int arr[] = { 2, 22, 58, 88, 1, 5 };

        int[] output = new int[arr.length];

        final int left = 0, right = arr.length;

        output = QuickSort.Sort(arr, left, right);

        for (int i : output) {
            System.out.println(i);
        }

    }

    public static int pivot(final int arr[], int start, int end) {
        final int pivot = arr[start];
        int swapIndx = start;
        for (int i = start + 1; i < end; i++) {
            if (pivot > arr[i]) {

                swapIndx++;
                swap(arr, swapIndx, i);
            }
        }
        swap(arr, start, swapIndx);

        return swapIndx;

    }

    private static void swap(final int[] arr, final int i, final int j) {

        final int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static int[] Sort(final int[] arr, int left, int right) {

        if (left < right) {

            final int pivotindex = pivot(arr, left, right);
            Sort(arr, left, pivotindex - 1);
            Sort(arr, pivotindex + 1, right);

        }

        return arr;
    }
}