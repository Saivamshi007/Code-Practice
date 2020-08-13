class TestArea {
    public static void main(String[] args) {

        boolean a = prime(10, 10 / 2);

        System.out.println(a);

    }

    public static boolean prime(int i, int a) {
        if (i == 1) {
            return false;
        }
        if (i % a == 0) {
            return true;
        } else {
            return prime(i, i - 1);
        }
    }
}