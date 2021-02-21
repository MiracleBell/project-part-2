package tasks.block9;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestStudent {
    @Test
    public void testClass1() {
        String surname = "Doe";
        String name = "John";
        String secondName = "John";
        int age = 18;
        Gender gender = Gender.MALE;
        String university = "OMSU";
        String faculty = "Math";
        String speciality = "God of Math";
        Student student = new Student(
                surname,
                name,
                secondName,
                age,
                gender,
                university,
                faculty,
                speciality
        );

        assertEquals(surname, student.getSurname());
        assertEquals(name, student.getName());
        assertEquals(secondName, student.getSecondName());
        assertEquals(age, student.getAge());
        assertEquals(gender, student.getGender());
        assertEquals(university, student.getUniversity());
        assertEquals(faculty, student.getFaculty());
        assertEquals(speciality, student.getSpecialty());
    }

    @Test(expected = NullPointerException.class)
    public void testClass3() {
        String surname = "";
        String name = "John";
        String secondName = "John";
        int age = 18;
        Gender gender = Gender.MALE;
        String university = "OMSU";
        String faculty = "Math";
        String speciality = "God of Math";
        Student student = new Student(
                surname,
                name,
                secondName,
                age,
                gender,
                university,
                faculty,
                speciality
        );
    }

    @Test(expected = NullPointerException.class)
    public void testClass4() {
        String surname = null;
        String name = "John";
        String secondName = "John";
        int age = 18;
        Gender gender = Gender.MALE;
        String university = "OMSU";
        String faculty = "Math";
        String speciality = "God of Math";
        Student student = new Student(
                surname,
                name,
                secondName,
                age,
                gender,
                university,
                faculty,
                speciality
        );
    }

    @Test(expected = NullPointerException.class)
    public void testClass5() {
        String surname = "Doe";
        String name = "";
        String secondName = "John";
        int age = 18;
        Gender gender = Gender.MALE;
        String university = "OMSU";
        String faculty = "Math";
        String speciality = "God of Math";
        Student student = new Student(
                surname,
                name,
                secondName,
                age,
                gender,
                university,
                faculty,
                speciality
        );
    }

    @Test(expected = NullPointerException.class)
    public void testClass6() {
        String surname = "Doe";
        String name = null;
        String secondName = "John";
        int age = 18;
        Gender gender = Gender.MALE;
        String university = "OMSU";
        String faculty = "Math";
        String speciality = "God of Math";
        Student student = new Student(
                surname,
                name,
                secondName,
                age,
                gender,
                university,
                faculty,
                speciality
        );
    }

    @Test(expected = NullPointerException.class)
    public void testClass7() {
        String surname = "Doe";
        String name = "John";
        String secondName = "";
        int age = 18;
        Gender gender = Gender.MALE;
        String university = "OMSU";
        String faculty = "Math";
        String speciality = "God of Math";
        Student student = new Student(
                surname,
                name,
                secondName,
                age,
                gender,
                university,
                faculty,
                speciality
        );
    }

    @Test(expected = NullPointerException.class)
    public void testClass8() {
        String surname = "Doe";
        String name = "John";
        String secondName = null;
        int age = 18;
        Gender gender = Gender.MALE;
        String university = "OMSU";
        String faculty = "Math";
        String speciality = "God of Math";
        Student student = new Student(
                surname,
                name,
                secondName,
                age,
                gender,
                university,
                faculty,
                speciality
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void testClass9() {
        String surname = "Doe";
        String name = "John";
        String secondName = "John";
        int age = -18;
        Gender gender = Gender.MALE;
        String university = "OMSU";
        String faculty = "Math";
        String speciality = "God of Math";
        Student student = new Student(
                surname,
                name,
                secondName,
                age,
                gender,
                university,
                faculty,
                speciality
        );
    }

    @Test(expected = NullPointerException.class)
    public void testClass10() {
        String surname = "Doe";
        String name = "John";
        String secondName = "John";
        int age = 18;
        Gender gender = null;
        String university = "OMSU";
        String faculty = "Math";
        String speciality = "God of Math";
        Student student = new Student(
                surname,
                name,
                secondName,
                age,
                gender,
                university,
                faculty,
                speciality
        );
    }

    @Test(expected = NullPointerException.class)
    public void testClass11() {
        String surname = "Doe";
        String name = "John";
        String secondName = "John";
        int age = 18;
        Gender gender = Gender.MALE;
        String university = "";
        String faculty = "Math";
        String speciality = "God of Math";
        Student student = new Student(
                surname,
                name,
                secondName,
                age,
                gender,
                university,
                faculty,
                speciality
        );
    }

    @Test(expected = NullPointerException.class)
    public void testClass12() {
        String surname = "Doe";
        String name = "John";
        String secondName = "John";
        int age = 18;
        Gender gender = Gender.MALE;
        String university = null;
        String faculty = "Math";
        String speciality = "God of Math";
        Student student = new Student(
                surname,
                name,
                secondName,
                age,
                gender,
                university,
                faculty,
                speciality
        );
    }

    @Test(expected = NullPointerException.class)
    public void testClass13() {
        String surname = "Doe";
        String name = "John";
        String secondName = "John";
        int age = 18;
        Gender gender = Gender.MALE;
        String university = "OMSU";
        String faculty = "";
        String speciality = "God of Math";
        Student student = new Student(
                surname,
                name,
                secondName,
                age,
                gender,
                university,
                faculty,
                speciality
        );
    }

    @Test(expected = NullPointerException.class)
    public void testClass14() {
        String surname = "Doe";
        String name = "John";
        String secondName = "John";
        int age = 18;
        Gender gender = Gender.MALE;
        String university = "OMSU";
        String faculty = null;
        String speciality = "God of Math";
        Student student = new Student(
                surname,
                name,
                secondName,
                age,
                gender,
                university,
                faculty,
                speciality
        );
    }

    @Test(expected = NullPointerException.class)
    public void testClass15() {
        String surname = "Doe";
        String name = "John";
        String secondName = "John";
        int age = 18;
        Gender gender = Gender.MALE;
        String university = "OMSU";
        String faculty = "Math";
        String speciality = "";
        Student student = new Student(
                surname,
                name,
                secondName,
                age,
                gender,
                university,
                faculty,
                speciality
        );
    }

    @Test(expected = NullPointerException.class)
    public void testClass16() {
        String surname = "Doe";
        String name = "John";
        String secondName = "John";
        int age = 18;
        Gender gender = Gender.MALE;
        String university = "OMSU";
        String faculty = "Math";
        String speciality = null;
        Student student = new Student(
                surname,
                name,
                secondName,
                age,
                gender,
                university,
                faculty,
                speciality
        );
    }
}
