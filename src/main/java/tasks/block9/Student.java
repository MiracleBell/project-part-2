package tasks.block9;


import java.util.Objects;

public class Student extends Human {
    private String university;
    private String faculty;
    private String specialty;


    public Student(String surname, String name, String middleName, int age, Gender gender, String university, String faculty, String specialty) {
        super(surname, name, middleName, age, gender);
        if (university == null || university.equals("")) {
            throw new NullPointerException();
        }
        if (faculty == null || faculty.equals("")) {
            throw new NullPointerException();
        }
        if (specialty == null || specialty.equals("")) {
            throw new NullPointerException();
        }
        this.university = university;
        this.faculty = faculty;
        this.specialty = specialty;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(university, student.university) && Objects.equals(faculty, student.faculty) && Objects.equals(specialty, student.specialty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), university, faculty, specialty);
    }
}
