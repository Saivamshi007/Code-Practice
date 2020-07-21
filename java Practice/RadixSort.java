
public class RadixSort {
    public static void main(final String args[]) {
        final int[] arr = { 2, 5, 1, 6, 9, 11, 12 };

        RadixSort.radixSort(arr);

        for (int i : arr) {
            System.out.println(i);
        }

    }

    public static int getDigit(final int num, final int i) {
        return (int) Math.floor(Math.abs(num) / Math.pow(num, i) % 10);

    }

    public static int digitCount(final int num) {

        return (int) Math.floor(Math.abs(Math.log10(num))) + 1;

    }

    public static int mostDigit(final int[] arr) {
        int most = 0;
        for (int i = 0; i < arr.length; i++) {
            most = Math.max(most, digitCount(arr[i]));
        }

        return most;
    }

    // public static List<List<Integer>> radixSort(final int[] arr) {
    // final int largest = mostDigit(arr);
    // final List<List<Integer>> result = new ArrayList<List<Integer>>();
    // final Map<Integer, List<Integer>> hashmap = new HashMap<>();
    // final List<Integer> addList = new ArrayList<>();

    // for (int k = 0; k < 10; k++) {
    // hashmap.put(k, addList);
    // }

    // for (int i = 0; i < largest; i++) {

    // for (int j = 0; j < arr.length; j++) {
    // int digit = digit(arr[j], i);
    // if (hashmap.containsKey(digit)) {
    // hashmap.get(digit).add(arr[j]);
    // }

    // }

    // }

    // result.addAll(hashmap.values());

    // return result;
    // }

    public static void radixSort(final int[] arr) {
        final int largest = mostDigit(arr);

        for (int i = 0; i < largest; i++) {
            radixSingleSort(arr, i);

        }

    }

    public static void radixSingleSort(final int[] arr, final int i) {

        final int width = arr.length;

        final int[] countAray = new int[10];

        for (final int value : arr) {
            countAray[getDigit(value, i)]++;

        }

        for (int j = 1; j < 10; j++) {
            countAray[j] += countAray[j - 1];
        }

        int numItem = arr.length;

        int[] temp = new int[numItem];

        for (int tempIndex = numItem - 1; tempIndex >= 0; tempIndex--) {
            temp[--countAray[getDigit(arr[tempIndex], i)]] = arr[tempIndex];

        }

        for (int tempidx = 0; tempidx < numItem; tempidx++) {
            arr[tempidx] = temp[tempidx];
        }

    }

}