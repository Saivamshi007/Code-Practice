
class TestArea {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class SinglyLinkList {
        Node head;
        Node tail;
        int length;

        SinglyLinkList() {

            this.head = null;
            this.tail = null;
            this.length = 0;

        }
    }

    static Node push(int data) {

        SinglyLinkList list = new SinglyLinkList();

        Node newNode = new Node(data);

        if (list.head == null) {
            list.head = newNode;
            list.tail = newNode;

        } else {

            list.tail = newNode;
            list.tail.next = newNode;

        }

        list.length++;

        System.out.println(list.length);

        return newNode;

    }

    public static void main(String[] sunny) {

        // System.out.println(Math.floor(Math.log10(200)) + 1);

        // int[] arr = new int[10];

        // int[] compare1 = { 2, 2, 6, 8, 10 };

        // for (int i = 0; i < compare1.length - 1; i++) {
        // arr[compare1[i]]++;
        // }

        // for (int i : arr) {
        // System.out.println(i);
        // }

        // String[] arr = { "A", "s", "p", "w", "e", "b", "a", "B" };

        // Arrays.sort(arr);

        // for (int i = 0; i < arr.length; i++) {

        // System.out.println(arr[i]);
        // }

        Node output = push(1);
        Node output2 = push(1);

        System.out.println(output.data);
        System.out.println(output2.data);

    }

}