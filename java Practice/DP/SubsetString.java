
package DP;

import java.util.*;

public class SubsetString {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.next();

        printString(str, " ");

    }

    public static void printString(String str, String current_sub) {

        int n = str.length();

        if (n == 0) {
            System.out.println(current_sub);
            return;
        }

        printString(str.substring(1), current_sub);

        printString(str.substring(1), current_sub + str.charAt(0));

    }

}
