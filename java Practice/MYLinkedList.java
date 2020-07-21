public class MYLinkedList {

    static Node head;

    void insert(Student data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null) {

            head = node;

        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;

            }
            n.next = node;
        }

    }

    public void pop() {

        Node current = head;
        Node popiteam = current;

        while (current.next != null) {
            popiteam = current;
            current = current.next;

        }
        popiteam.next = null;

        if (size() == 0) {

            head = null;
        }

    }

    public void unshift(Student data) {

        Node temp = head;
        Node recieve = new Node();
        recieve.data = data;
        head = recieve;
        head.next = temp;

    }

    public void shift() {

        head = head.next;

    }

    // public int get(int index) {

    // Node current = head;
    // int count = 0;
    // while (count != index) {
    // current = current.next;
    // count++;

    // }

    // return current.data;

    // }

    public void insert(int index, Student data) {
        Node current = head;
        Node newNode = new Node();
        newNode.data = data;

        if (index > size() || index < 0) {
            System.out.println("invalid index");
        }

        Node previous = current;
        int v = 0;
        while (v != index) {
            previous = current;
            current = current.next;
            v++;

        }

        previous.next = newNode;
        newNode.next = current;

    }

    public int size() {
        int length = 0;

        Node curret = head;
        while (curret.next != null) {
            curret = curret.next;
            length++;

        }

        return length;

    }

    public void show() {
        Node current = head;

        while (current != null) {

            System.out.println(current.data);
            current = current.next;

        }
        // System.out.println(current.data);
    }

}