public class StudentSinglyList {

    private StudentNode head;

    public void addToFront(Student student) {
        StudentNode node = new StudentNode(student);
        node.setNext(head);
        head = node;
    }

    public void printlist() {
        StudentNode current = head;
        System.err.println("HEAD->");

        while (current != null) {
            System.out.println(current);
            System.out.println("->");
            current = current.getNext();
        }
        System.out.println("Null");
    }
}