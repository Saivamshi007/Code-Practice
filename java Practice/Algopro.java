import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Algopro {

    public static void main(final String[] args) throws IOException {
        int choice;

        final Scanner s = new Scanner(System.in);

        System.out.println("1.Bubble Sort\n2.Selection Sort\n3.Insertion Sort\n4.Merge Sort1");

        System.out.println(
                "5.Quick Sort\n6.LRU\n7.SinglyLinked List\n8.Doubbly Linklist\n9.Stack\n10.Queue\n11.Binnary Easrch Tree");
        choice = s.nextInt();
        int[] arr, output;

        switch (choice) {
            case 1:
                arr = arrayinput();
                output = bubblesort(arr);

                printarray(output);

            case 2:
                arr = arrayinput();
                output = selectionsort(arr);
                printarray(output);

            case 11:

                BinarySearchtree bst = new BinarySearchtree();
                System.out.println("Binary Tree");
                bst.push(10);
                bst.push(2);
                bst.push(1);
                bst.push(8);
                bst.push(20);
                bst.push(30);

                bst.push(9);

                bst.search(8);

                bst.show();

        }

    }

    public static int[] arrayinput() throws IOException {
        int[] arr;

        final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the array");

        final int size = Integer.parseInt(bf.readLine());
        arr = new int[size];
        System.out.println("Enter array");

        for (int i = 0; i < size; i++) {

            arr[i] = Integer.parseInt(bf.readLine());

        }
        return arr;
    }

    public static int[] selectionsort(final int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int lowest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    lowest = j;
                }

            }
            swap(arr, i, lowest);

        }

        return arr;

    }

    public static void printarray(int[] arr) {

        System.out.println("Sorted Array");

        for (int output : arr) {
            System.out.println(output);
        }

    }

    public static int[] bubblesort(final int[] arr) {

        final int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    swap(arr, j, j + 1);

                }
            }
        }

        return arr;

    }

    public static void swap(final int[] arr, final int i, final int j) {
        int temp;

        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static class BSTNode {
        int data;
        BSTNode left;
        BSTNode right;

    }

    public static class BinarySearchtree {
        BSTNode root;

        void push(int value) {

            BSTNode newNode = new BSTNode();
            newNode.data = value;

            if (this.root == null) {
                this.root = newNode;
                return;
            }
            var current = this.root;
            while (true) {
                if (value == current.data)
                    return;
                if (value < current.data) {
                    if (current.left == null) {
                        current.left = newNode;

                        return;
                    }
                    current = current.left;
                } else {
                    if (current.right == null) {
                        current.right = newNode;
                        return;
                    }
                    current = current.right;
                }
            }

        }

        void search(int value) {

            BSTNode current = root;

            boolean found = false;

            while (current != null && !found) {
                if (value < current.data) {
                    current = current.left;
                } else if (value > current.data) {
                    current = current.right;
                } else {
                    found = true;
                }

            }

            if (!found) {

                return;
            }

            if (found) {
                System.out.println("found");

            }

        }

        void show() {
            BSTNode current = root;

            System.out.println("Right");

            while (current.right != null) {

                System.out.println(current.right.data);

                current = current.right;

                if (current == null) {
                    return;
                }

            }

            System.out.println("Left");

            current = root;

            while (current.left != null) {
                System.out.println(current.left.data);
                current = current.left;
            }
        }

    }

}