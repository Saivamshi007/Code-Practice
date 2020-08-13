public class GoldenRatioFibonacci {

    public static void main(String[] args) {
        int i = 0, n = 9, result;
        while (i < n) {

            result = (int) (((Math.pow(((Math.sqrt(5) + 1) / 2), i)) / Math.sqrt(5)) + 0.5);
            System.out.println(result);
            i++;
        }
    }

}
