package DP;

import java.util.*;

public class TowerOfHanoi {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        char from = s.next().charAt(0);
        char to = s.next().charAt(0);
        char aux = s.next().charAt(0);

        Hanoi(n, from, to, aux);

    }

    public static void Hanoi(int n, char from, char to, char aux) {

        if (n == 1) {
            System.out.println("Move Disk 1 form rod " + from + " to rod " + to);
            return;
        }

        Hanoi(n - 1, from, aux, to);
        System.out.println("Move disk " + n + " from rod " + from + " to rod " + to);
        Hanoi(n - 1, aux, to, from);

    }

}
