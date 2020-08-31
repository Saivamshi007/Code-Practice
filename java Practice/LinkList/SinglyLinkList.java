public class SinglyLinkList {
    public static void main(final String[] args) {

        Link list = new Link();

        list.insert(6);
        list.insert(5);
        list.insert(10);

        list.show();

        // list.printNode(list.reverse());

    }

    static class Node {
        int data;
        Node next;

    }

    static class Link {
        Node head;
        Node tail;
        int length = 0;

        public void insert(final int data) {
            final Node newNode = new Node();
            newNode.data = data;

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {

                tail.next = newNode;
                tail = newNode;

                // while (current.next != null) {
                // current = current.next;

                // }
                // current.next = newNode;
            }

            length++;

        }

        public Node reverse() {

            Node current = head;
            Node previous = null;
            Node next = null;
            while (current != null) {
                next = current.next;
                current.next = previous;
                previous = current;
                current = next;

            }

            return previous;

        }

        public void printNode(Node node) {

            while (node != null) {
                System.out.println(node.data);
                node = node.next;
            }

        }

        public void show() {
            Node n = head;
            while (n.next != null) {
                System.out.println(n.data);
                n = n.next;
            }

            System.out.println(n.data);
        }
    }

}