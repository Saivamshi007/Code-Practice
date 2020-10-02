package DP;

// Part of OpenGenus IQ
class Findsubsets {
    static boolean subset_sum_util(int list[], int starting_index, int sum) {
        if (sum == 0)
            return true;
        if (list.length - starting_index == 1)
            if (list[starting_index] == sum)
                return true;
            else
                return false;

        boolean result_1 = subset_sum_util(list, starting_index + 1, sum - list[starting_index]);

        boolean result_2 = subset_sum_util(list, starting_index + 1, sum);

        return result_1 | result_2;
    }

    static boolean subset_sum(int list[], int sum) {
        if (list.length < 1)
            return false;
        if (list.length == 1)
            if (list[0] == sum)
                return true;
            else
                return false;

        return subset_sum_util(list, 0, sum);
    }

    public static void main(String[] args) {
        int list[] = { 2, 1, 3 };
        System.out.println(subset_sum(list, 3));
    }
}
