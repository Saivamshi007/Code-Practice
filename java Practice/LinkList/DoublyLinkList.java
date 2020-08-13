
public class DoublyLinkList {
    public static void main(String[] args) {

        try {

            DoubleList list = new DoubleList();
            list.insert(5);
            list.insert(6);
            list.insert(2);
            list.insert(22);
            list.insert(99);

            list.insert(2, 44);

            // list.insert(1, 55);

            // list.pop();
            // list.pop();

            // Node n = list.get(2);
            // System.out.println(n.data);

            list.show();
        } catch (Exception r) {
            System.out.println("Null");
        }

    }

    public static class Node {
        int data;
        Node next;
        Node prev;

    }

    static class DoubleList {
        Node head;
        Node tail;
        int length = 0;

        void insert(int data) {
            Node newNode = new Node();
            newNode.data = data;
            if (head == null) {
                head = newNode;
                tail = newNode;

            } else {

                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;

            }

            length++;

        }

        void pop() {
            if (head == null) {
                System.out.println("List is Empty");
            }

            if (length == 1) {
                head = null;
                tail = null;
            } else {
                Node popingNode = tail;
                tail = popingNode.prev;
                popingNode.prev = null;
                tail.next = null;

            }

            length--;
        }

        Node get(int index) {

            if (index < 0)
                System.out.println("invalid");
            if (index == length)
                return tail;
            if (index == 0)
                return head;

            if (index <= Math.floor(length / 2)) {

                Node n = head;
                int count = 0;
                while (index != count) {
                    count++;
                    n = n.next;

                }

                return n;

            } else {

                Node n = tail;
                int count = length - 1;
                while (index != count) {
                    count--;
                    n = n.prev;

                }

                return n;

            }

        }

        void shift() {

            if (length == 0) {
                System.out.println("Empty list");
            }
            if (length == 1) {
                head = null;
                tail = null;

            } else {
                Node popItem = head;
                head = popItem.next;
                head.prev = null;

            }
            length--;

        }

        void unshift(int data) {
            Node newNode = new Node();
            newNode.data = data;
            if (length == 0) {
                head = newNode;
                tail = newNode;

            } else {
                head.prev = newNode;

            }

        }

        void insert(int index, int data) {
            if (index < 0 || index > length) {
                System.out.println("invalid");
            }

            if (index == 0) {
                unshift(data);
            }
            if (index == length)
                insert(data);

            Node before = get(index - 1);
            Node current = before.next;

            Node newNode = new Node();
            newNode.data = data;

            current.prev = newNode;
            newNode.prev = before;
            before.next = newNode;
            newNode.next = current;

        }

        void show() {
            Node n = head;

            while (n != null) {

                System.out.println(n.data);
                n = n.next;

            }

            System.err.println("Length = " + length);

        }
    }

}