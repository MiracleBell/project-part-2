package tasks.block6;

import java.util.Objects;

public class Student extends Human {
    private String faculty;

    public Student(String surname, String name, String middleName, int age, String faculty) {
        super(surname, name, middleName, age);
        setFaculty(faculty);
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        if (faculty == null || faculty.equals("")) {
            throw new NullPointerException("Field 'faculty' can't be empty");
        }
        this.faculty = faculty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(faculty, student.faculty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), faculty);
    }
}
