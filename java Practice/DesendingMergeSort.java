
public class DesendingMergeSort {
    public static void main(final String[] args) {

        int[] arr = { 22, 98, 52, 64 };

        int[] output = new int[arr.length];

        output = DesendingMergeSort.mergeSort(arr);

        for (int i : output) {
            System.out.println(i);
        }

    }

    public static int[] merge(final int[] arr1, final int[] arr2) {

        final int n = arr1.length, m = arr2.length;
        final int[] emptyAraay = new int[n + m];
        int i, j, k;
        i = j = k = 0;

        while (i < n && j < m) {
            if (arr1[i] > arr2[j]) {

                emptyAraay[k++] = arr1[i++];

            } else {
                emptyAraay[k++] = arr2[j++];
            }
        }

        while (i < n) {
            emptyAraay[k++] = arr1[i++];
        }

        while (j < m) {
            emptyAraay[k++] = arr2[j++];
        }

        return emptyAraay;

    }

    public static int[] mergeSort(final int[] arr) {

        int size = arr.length;

        if (size <= 1) {
            return arr;
        }

        int[] left, right;

        int mid = Math.round(arr.length / 2);

        left = new int[mid];

        if (arr.length % 2 == 0) {
            right = new int[mid];
        } else {
            right = new int[mid + 1];
        }

        for (int i = 0; i < left.length; i++) {
            left[i] = arr[i];
        }

        for (int j = 0; j < right.length; j++) {
            right[j] = arr[mid + j];
        }

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);

    }

}