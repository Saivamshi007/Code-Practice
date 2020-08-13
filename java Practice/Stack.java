
public class Stack {
    public static void main(String[] args) {

        Stacking stack = new Stacking();

        stack.insert(1);
        stack.insert(2);
        stack.insert(3);
        stack.insert(4);
        stack.insert(5);

        stack.pop();

        stack.show();

    }

    public static class Node {
        int data;
        Node next;
    }

    public static class Stacking {
        Node first;
        Node last;
        int length = 0;

        void insert(final int data) {
            Node newNode = new Node();
            newNode.data = data;

            if (first == null) {
                first = newNode;
                last = newNode;
            } else {
                var temp = first;
                first = newNode;
                first.next = temp;

            }

            length++;
        }

        void pop() {

            Node n = first;

            first = n.next;

            length--;

        }

        void show() {
            Node n = first;

            while (n != null) {
                System.out.println(n.data);
                n = n.next;

            }
        }

    }

}