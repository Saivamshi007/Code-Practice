import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinarysearchTree {
    public static void main(String[] args) {

        BST bst = new BST();

        // BST tree = new BST();

        bst.insert(1);
        bst.insert(2);
        bst.insert(10);
        bst.insert(3);
        bst.insert(12);
        bst.insert(11);

        bst.insert(15);

        // tree.root = new Node();
        // tree.root.data = 1;

        // tree.root.left = new Node();
        // tree.root.left.data = 2;
        // tree.root.right = new Node();
        // tree.root.right.data = 3;

        // tree.root.left.left = new Node();
        // tree.root.left.left.data = 4;
        // tree.root.left.right = new Node();
        // tree.root.left.right.data = 5;
        // tree.root.right.left = new Node();
        // tree.root.right.left.data = 4;
        // tree.root.right.right = new Node();
        // tree.root.right.right.data = 3;

        bst.nonRecursivePreorder();

    }

    public static class Node {
        int data;
        Node left;
        Node right;
        Node next;
    }

    public static class Queues {

        Node head, tail;

        void push(Node data) {
            var newNode = new Node();
            newNode = data;

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }

        }

        int length() {
            int length = 0;
            var current = head;

            while (current != null) {
                length++;
                current = current.next;

            }

            return length;

        }

        Node shift() {

            var current = head;

            if (current.next == null) {
                return current;
            } else {

                head = current.next;

            }

            return current;

        }

        void show() {
            var current = head;

            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }

    }

    public static class BST {

        Node root;

        boolean isMirror() {

            return isMirrorCheck(root, root);

        }

        private boolean isMirrorCheck(Node root2, Node root3) {
            if (root2 == null && root3 == null) {

                return true;

            }
            if (root2 == null || root3 == null) {
                return false;
            }

            return root2.data == root3.data && isMirrorCheck(root2.left, root3.right)
                    && isMirrorCheck(root2.right, root3.left);

        }

        void preoreder() {
            PreorederPrint(root);
        }

        private void PreorederPrint(Node root2) {

            if (root2 == null) {
                return;
            }

            System.out.println(root2.data);

            PreorederPrint(root2.left);
            PreorederPrint(root2.right);

        }

        void InorderTraversal() {

            Stack<Node> data = new Stack<Node>();

            Queues output = new Queues();

            Node current = root;

            System.out.println(data.isEmpty());

            while (!data.isEmpty() || current != null) {

                while (current != null) {

                    data.push(current);

                    current = current.left;
                }

                current = data.pop();

                output.push(current);

                current = current.right;

            }

            output.show();

        }

        void nonRecursivePreorder() {

            Stack<Node> visiting = new Stack<Node>();

            var current = root;

            visiting.push(current);

            while (!visiting.isEmpty()) {

                current = visiting.pop();

                System.out.println(current.data);

                if (current.right != null) {
                    visiting.push(current.right);
                }

                if (current.left != null) {
                    visiting.push(current.left);
                }

            }

        }

        int maxvalue() {

            int max = root.right.data;

            Node current = root.right;

            while (current != null) {
                max = current.data;
                current = current.right;
            }

            return max;
        }

        public void deleteNode(int key) {
            root = deleteRec(root, key);
        }

        public Node deleteRec(Node root, int key) {

            if (root == null) {
                return root;
            }

            if (key < root.data) {
                root.left = deleteRec(root.left, key);
            } else if (key > root.data) {
                root.right = deleteRec(root.right, key);
            } else {

                if (root.left == null) {

                    return root.left;

                } else if (root.right == null) {
                    return root.right;
                }

                root.data = minValue(root.right);

                root.right = deleteRec(root.right, root.data);
            }

            return root;

        }

        int minValue(Node root) {
            int minv = root.data;
            while (root.left != null) {
                minv = root.left.data;
                root = root.left;
            }
            return minv;
        }

        public void insert(int data) {

            Node newNode = new Node();
            newNode.data = data;

            if (root == null) {
                root = newNode;
            } else {
                Node current = root;

                while (true) {
                    if (current.data > data) {
                        if (current.left == null) {

                            current.left = newNode;
                            return;

                        } else {
                            current = current.left;
                        }
                    } else {
                        if (current.right == null) {
                            current.right = newNode;
                            return;
                        } else {

                            current = current.right;

                        }
                    }
                }
            }

        }

        void search(int key) {
            Node current = root;
            boolean found = false;

            while (current != null && !found) {

                if (current.data < key) {
                    current = current.right;
                } else if (current.data > key) {
                    current = current.left;
                } else {
                    found = true;
                }

                if (!found) {
                    System.out.println("Found");
                } else {
                    System.out.println("Not Found");
                }

            }
        }

        void BFS() {

            Node current = root;

            Queue<Node> visited = new LinkedList<Node>();

            Queues output = new Queues();

            visited.add(current);

            while (visited.size() != 0) {

                current = visited.remove();

                output.push(current);

                // System.out.println(current.left.data);

                if (current.left != null) {

                    visited.add(current.left);

                }
                if (current.right != null) {
                    visited.add(current.right);

                }

            }

            output.show();

        }

    }

}