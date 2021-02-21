package tasks.block6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestStudent {
    @Test
    public void testConstructorAndGetters() {
        String surname = "Doe";
        String name = "John";
        String secondName = "John";
        int age = 18;
        String faculty = "Math";
        Student student = new Student(
                surname,
                name,
                secondName,
                age,
                faculty
        );

        assertEquals(surname, student.getSurname());
        assertEquals(name, student.getName());
        assertEquals(secondName, student.getMiddleName());
        assertEquals(age, student.getAge());
        assertEquals(faculty, student.getFaculty());
    }

    @Test
    public void testSetters() {
        String surname = "Doe";
        String name = "John";
        String secondName = "John";
        int age = 18;
        String faculty = "Math";
        Student student = new Student(
                surname,
                name,
                secondName,
                age,
                faculty
        );


        String newSurname = "Ivanov";
        String newName = "Ivan";
        String newSecondName = "Ivanovich";
        int newAge = 60;
        String newFaculty = "Physic";

        student.setSurname(newSurname);
        student.setName(newName);
        student.setMiddleName(newSecondName);
        student.setAge(newAge);
        student.setFaculty(newFaculty);

        assertEquals(newSurname, student.getSurname());
        assertEquals(newName, student.getName());
        assertEquals(newSecondName, student.getMiddleName());
        assertEquals(newAge, student.getAge());
        assertEquals(newFaculty, student.getFaculty());
    }

    @Test
    public void testSetters2() {
        String surname = "Doe";
        String name = "John";
        String secondName = "John";
        int age = 18;
        String faculty = "Math";
        Student student = new Student(
                surname,
                name,
                secondName,
                age,
                faculty
        );

        student.setSurname("Ivanov");
        student.setName("Ivan");
        student.setMiddleName("Ivanovich");
        student.setAge(60);
        student.setFaculty("Physic");

        assertNotEquals(surname, student.getSurname());
        assertNotEquals(name, student.getName());
        assertNotEquals(secondName, student.getMiddleName());
        assertNotEquals(age, student.getAge());
        assertNotEquals(faculty, student.getFaculty());
    }


    @Test(expected = NullPointerException.class)
    public void testClassException1() {
        String surname = "";
        String name = "John";
        String secondName = "John";
        int age = 18;
        String faculty = "Math";
        Student student = new Student(
                surname,
                name,
                secondName,
                age,
                faculty
        );
    }

    @Test(expected = NullPointerException.class)
    public void testClassException2() {
        String surname = null;
        String name = "John";
        String secondName = "John";
        int age = 18;
        String faculty = "Math";
        Student student = new Student(
                surname,
                name,
                secondName,
                age,
                faculty
        );
    }

    @Test(expected = NullPointerException.class)
    public void testClassException3() {
        String surname = "Doe";
        String name = "";
        String secondName = "John";
        int age = 18;
        String faculty = "Math";
        Student student = new Student(
                surname,
                name,
                secondName,
                age,
                faculty
        );
    }

    @Test(expected = NullPointerException.class)
    public void testClassException4() {
        String surname = "Doe";
        String name = null;
        String secondName = "John";
        int age = 18;
        String faculty = "Math";
        Student student = new Student(
                surname,
                name,
                secondName,
                age,
                faculty
        );
    }

    @Test(expected = NullPointerException.class)
    public void testClassException5() {
        String surname = "Doe";
        String name = "John";
        String secondName = "";
        int age = 18;
        String faculty = "Math";
        Student student = new Student(
                surname,
                name,
                secondName,
                age,
                faculty
        );
    }

    @Test(expected = NullPointerException.class)
    public void testClassException6() {
        String surname = "Doe";
        String name = "John";
        String secondName = null;
        int age = 18;
        String faculty = "Math";
        Student student = new Student(
                surname,
                name,
                secondName,
                age,
                faculty
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void testClassException7() {
        String surname = "Doe";
        String name = "John";
        String secondName = "John";
        int age = -18;
        String faculty = "Math";
        Student student = new Student(
                surname,
                name,
                secondName,
                age,
                faculty
        );
    }

    @Test(expected = NullPointerException.class)
    public void testClassException8() {
        String surname = "Doe";
        String name = "John";
        String secondName = "John";
        int age = 18;
        String faculty = "";
        Student student = new Student(
                surname,
                name,
                secondName,
                age,
                faculty
        );
    }

    @Test(expected = NullPointerException.class)
    public void testClassException9() {
        String surname = "Doe";
        String name = "John";
        String secondName = "John";
        int age = 18;
        String faculty = null;
        Student student = new Student(
                surname,
                name,
                secondName,
                age,
                faculty
        );
    }

    @Test(expected = NullPointerException.class)
    public void testClassException10() {
        String surname = "Doe";
        String name = "John";
        String secondName = "John";
        int age = 18;
        String faculty = "Math";
        Student student = new Student(
                surname,
                name,
                secondName,
                age,
                faculty
        );
        student.setSurname("");
    }

    @Test(expected = NullPointerException.class)
    public void testClassException11() {
        String surname = "Doe";
        String name = "John";
        String secondName = "John";
        int age = 18;
        String faculty = "Math";
        Student student = new Student(
                surname,
                name,
                secondName,
                age,
                faculty
        );
        student.setSurname(null);
    }

    @Test(expected = NullPointerException.class)
    public void testClassException12() {
        String surname = "Doe";
        String name = "John";
        String secondName = "John";
        int age = 18;
        String faculty = "Math";
        Student student = new Student(
                surname,
                name,
                secondName,
                age,
                faculty
        );
        student.setName("");
    }

    @Test(expected = NullPointerException.class)
    public void testClassException13() {
        String surname = "Doe";
        String name = "John";
        String secondName = "John";
        int age = 18;
        String faculty = "Math";
        Student student = new Student(
                surname,
                name,
                secondName,
                age,
                faculty
        );
        student.setName(null);
    }

    @Test(expected = NullPointerException.class)
    public void testClassException14() {
        String surname = "Doe";
        String name = "John";
        String secondName = "John";
        int age = 18;
        String faculty = "Math";
        Student student = new Student(
                surname,
                name,
                secondName,
                age,
                faculty
        );
        student.setMiddleName("");
    }

    @Test(expected = NullPointerException.class)
    public void testClassException15() {
        String surname = "Doe";
        String name = "John";
        String secondName = "John";
        int age = 18;
        String faculty = "Math";
        Student student = new Student(
                surname,
                name,
                secondName,
                age,
                faculty
        );
        student.setMiddleName(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testClassException16() {
        String surname = "Doe";
        String name = "John";
        String secondName = "John";
        int age = 18;
        String faculty = "Math";
        Student student = new Student(
                surname,
                name,
                secondName,
                age,
                faculty
        );
        student.setAge(-2);
    }

    @Test(expected = NullPointerException.class)
    public void testClassException17() {
        String surname = "Doe";
        String name = "John";
        String secondName = "John";
        int age = 18;
        String faculty = "Math";
        Student student = new Student(
                surname,
                name,
                secondName,
                age,
                faculty
        );

        student.setFaculty("");
    }

    @Test(expected = NullPointerException.class)
    public void testClassException18() {
        String surname = "Doe";
        String name = "John";
        String secondName = "John";
        int age = 18;
        String faculty = "Math";
        Student student = new Student(
                surname,
                name,
                secondName,
                age,
                faculty
        );
        student.setFaculty(null);
    }
}
