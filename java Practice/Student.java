public class Student {
    int id;
    String firstName;
    String lastName;

    Student(int id, String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Student student = (Student) obj;

        if (id != student.id)
            return false;
        if (!firstName.equals(student.firstName))
            return false;

        return lastName.equals(student.lastName);
    }

    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return ("FirstName: " + firstName + "  " + " LastName: " + lastName + "  " + "Id: " + id);
    }

}