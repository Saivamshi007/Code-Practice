public class MySinglyList {
    public static void main(String[] args) {

        try {

            MYLinkedList list = new MYLinkedList();

            Student s1 = new Student(1, "ss", "ss");
            Student s2 = new Student(2, "hh", "dd");
            Student s3 = new Student(3, "dd", "gf");
            Student s4 = new Student(4, "bb", "tt");
            Student s5 = new Student(5, "qq", "ll");

            list.insert(s1);
            list.insert(s2);
            list.insert(s3);
            list.insert(s4);

            list.remove(2);

            // list.unshift(6);
            // list.shift();
            // list.pop();
            // list.show();

            list.show();

        } catch (Exception e) {
            System.out.println("Null");
        }

    }
}