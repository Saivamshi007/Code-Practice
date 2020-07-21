public class MergeSort {

    public static void main(final String[] args) {

        int[] arr = { 10, 3, 5, 2, 16, 9 };

        final MergeSort ms = new MergeSort();
        int[] output = ms.Sort(arr);

        for (int i : output) {
            System.out.println(i);
        }

    }

    public int[] Sort(final int[] arr) {

        if (arr.length <= 1) {
            return arr;
        }

        final int mid = Math.round(arr.length / 2);

        int[] left = new int[mid];
        int[] right;

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

        left = Sort(left);
        right = Sort(right);

        return Merge(left, right);

    }

    public int[] Merge(final int[] arr1, final int[] arr2) {
        int i = 0, j = 0, k = 0;

        final int n = arr1.length;
        final int m = arr2.length;

        final int[] result = new int[m + n];

        while (i < n && j < m) {
            if (arr2[j] > arr1[i]) {
                result[k++] = arr1[i++];

            } else {

                result[k++] = arr2[j++];

            }

        }

        while (i < n) {
            result[k++] = arr1[i++];

        }
        while (j < m) {
            result[k++] = arr2[j++];

        }

        return result;
    }

}