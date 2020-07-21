
public class DoublyLinkList {
    public static void main(String[] args) {

        DoubleList list = new DoubleList();
        list.insert(5);
        list.insert(6);
        list.insert(2);

        list.show();

    }

    public static class Node {
        int data;
        Node next;
        Node prev;

    }

    static class DoubleList {
        Node head;

        void insert(int data) {
            Node newNode = new Node();
            newNode.data = data;
            if (head == null) {
                head = newNode;

            } else {
                Node n = head;
                Node butone = n;

                while (n.next != null) {
                    butone = n;
                    n = n.next;

                }
                n.next = newNode;
                n.prev = butone;

            }

        }

        void show() {
            Node n = head;

            while (n.next != null) {

                System.out.println(n.data);
                n = n.next;

            }
            System.out.println(n.data);

        }
    }

}