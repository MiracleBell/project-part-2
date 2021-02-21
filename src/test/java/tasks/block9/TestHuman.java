package tasks.block9;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHuman {
    @Test
    public void testClass1() {
        String surname = "Doe";
        String name = "John";
        String secondName = "John";
        int age = 18;
        Gender gender = Gender.MALE;
        Human human = new Human(
                surname,
                name,
                secondName,
                age,
                gender
        );

        assertEquals(surname, human.getSurname());
        assertEquals(name, human.getName());
        assertEquals(secondName, human.getSecondName());
        assertEquals(age, human.getAge());
        assertEquals(gender, human.getGender());
    }

    @Test
    public void testClass2() {
        String surname = "Does";
        String name = "Johnes";
        String secondName = "John";
        int age = 187;
        Gender gender = Gender.FEMALE;
        Human human = new Human(
                surname,
                name,
                secondName,
                age,
                gender
        );

        assertEquals(surname, human.getSurname());
        assertEquals(name, human.getName());
        assertEquals(secondName, human.getSecondName());
        assertEquals(age, human.getAge());
        assertEquals(gender, human.getGender());
    }

    @Test(expected = NullPointerException.class)
    public void testClass3() {
        String surname = "";
        String name = "John";
        String secondName = "John";
        int age = 18;
        Gender gender = Gender.MALE;
        Human human = new Human(
                surname,
                name,
                secondName,
                age,
                gender
        );
    }

    @Test(expected = NullPointerException.class)
    public void testClass4() {
        String surname = null;
        String name = "John";
        String secondName = "John";
        int age = 18;
        Gender gender = Gender.MALE;
        Human human = new Human(
                surname,
                name,
                secondName,
                age,
                gender
        );
    }

    @Test(expected = NullPointerException.class)
    public void testClass5() {
        String surname = "Doe";
        String name = "";
        String secondName = "John";
        int age = 18;
        Gender gender = Gender.MALE;
        Human human = new Human(
                surname,
                name,
                secondName,
                age,
                gender
        );
    }

    @Test(expected = NullPointerException.class)
    public void testClass6() {
        String surname = "Doe";
        String name = null;
        String secondName = "John";
        int age = 18;
        Gender gender = Gender.MALE;
        Human human = new Human(
                surname,
                name,
                secondName,
                age,
                gender
        );
    }

    @Test(expected = NullPointerException.class)
    public void testClass7() {
        String surname = "Doe";
        String name = "John";
        String secondName = "";
        int age = 18;
        Gender gender = Gender.MALE;
        Human human = new Human(
                surname,
                name,
                secondName,
                age,
                gender
        );
    }

    @Test(expected = NullPointerException.class)
    public void testClass8() {
        String surname = "Doe";
        String name = "John";
        String secondName = null;
        int age = 18;
        Gender gender = Gender.MALE;
        Human human = new Human(
                surname,
                name,
                secondName,
                age,
                gender
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void testClass9() {
        String surname = "Doe";
        String name = "John";
        String secondName = "John";
        int age = -2;
        Gender gender = Gender.MALE;
        Human human = new Human(
                surname,
                name,
                secondName,
                age,
                gender
        );
    }

    @Test(expected = NullPointerException.class)
    public void testClass10() {
        String surname = "Doe";
        String name = "John";
        String secondName = "John";
        int age = 18;
        Gender gender = null;
        Human human = new Human(
                surname,
                name,
                secondName,
                age,
                gender
        );
    }


}
