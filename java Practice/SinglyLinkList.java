public class SinglyLinkList {
    public static void main(final String[] args) {

        Student myName = new Student(1, "saivamshi", "ravikumar");
        Student stu1 = new Student(2, "john", "north");
        Student stu2 = new Student(3, "rody", "ss");

        StudentSinglyList list = new StudentSinglyList();
        list.addToFront(myName);
        list.addToFront(stu1);
        list.addToFront(stu2);

        list.unshift(6);

        list.printlist();

    }
}