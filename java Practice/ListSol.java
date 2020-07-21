import java.util.ArrayList;
import java.util.List;

public class ListSol {
    public static void main(final String[] args) {

        List<Student> StudentList = new ArrayList<>();

        boolean b;

        Student first = new Student(62, "sunny", "Mistigon");

        StudentList.add(first);
        StudentList.add(new Student(65, "sai", "vamshi"));

        Student sd = new Student(0, null, null);

        sd.setfirstName("sss");

        b = StudentList.contains(first);
        System.out.println(b);

    }
}