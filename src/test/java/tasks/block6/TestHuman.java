package tasks.block6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHuman {
    @Test
    public void testClassConstructorAndGetters() {
        String surname = "Doe";
        String name = "John";
        String secondName = "John";
        int age = 18;
        Human human = new Human(
                surname,
                name,
                secondName,
                age
        );

        assertEquals(surname, human.getSurname());
        assertEquals(name, human.getName());
        assertEquals(secondName, human.getMiddleName());
        assertEquals(age, human.getAge());
    }

    @Test
    public void testClassSetters() {
        String surname = "Doe";
        String name = "John";
        String secondName = "John";
        int age = 18;
        Human human = new Human(
                surname,
                name,
                secondName,
                age
        );

        String newSurname = "Doe";
        String newName = "John";
        String newSecondName = "John";
        int newAge = 18;

        human.setSurname(newSurname);
        human.setName(newName);
        human.setMiddleName(newSecondName);
        human.setAge(newAge);

        assertEquals(newSurname, human.getSurname());
        assertEquals(newName, human.getName());
        assertEquals(newSecondName, human.getMiddleName());
        assertEquals(newAge, human.getAge());
    }

    @Test(expected = NullPointerException.class)
    public void testClassException2() {
        String surname = "";
        String name = "John";
        String secondName = "John";
        int age = 18;
        Human human = new Human(
                surname,
                name,
                secondName,
                age
        );
    }


    @Test(expected = NullPointerException.class)
    public void testClassException3() {
        String surname = null;
        String name = "John";
        String secondName = "John";
        int age = 18;
        Human human = new Human(
                surname,
                name,
                secondName,
                age
        );
    }


    @Test(expected = NullPointerException.class)
    public void testClassException4() {
        String surname = "Doe";
        String name = "";
        String secondName = "John";
        int age = 18;
        Human human = new Human(
                surname,
                name,
                secondName,
                age
        );
    }


    @Test(expected = NullPointerException.class)
    public void testClassException5() {
        String surname = "Doe";
        String name = null;
        String secondName = "John";
        int age = 18;
        Human human = new Human(
                surname,
                name,
                secondName,
                age
        );
    }


    @Test(expected = NullPointerException.class)
    public void testClassException6() {
        String surname = "Doe";
        String name = "John";
        String secondName = "";
        int age = 18;
        Human human = new Human(
                surname,
                name,
                secondName,
                age
        );
    }


    @Test(expected = NullPointerException.class)
    public void testClassException7() {
        String surname = "Doe";
        String name = "John";
        String secondName = null;
        int age = 18;
        Human human = new Human(
                surname,
                name,
                secondName,
                age
        );
    }


    @Test(expected = IllegalArgumentException.class)
    public void testClassException8() {
        String surname = "Doe";
        String name = "John";
        String secondName = "John";
        int age = -18;
        Human human = new Human(
                surname,
                name,
                secondName,
                age
        );
    }

    @Test(expected = NullPointerException.class)
    public void testClassException9() {
        String surname = "Doe";
        String name = "John";
        String secondName = "John";
        int age = 18;
        Human human = new Human(
                surname,
                name,
                secondName,
                age
        );
        human.setSurname("");
    }

    @Test(expected = NullPointerException.class)
    public void testClassException10() {
        String surname = "Doe";
        String name = "John";
        String secondName = "John";
        int age = 18;
        Human human = new Human(
                surname,
                name,
                secondName,
                age
        );
        human.setSurname(null);
    }

    @Test(expected = NullPointerException.class)
    public void testClassException11() {
        String surname = "Doe";
        String name = "John";
        String secondName = "John";
        int age = 18;
        Human human = new Human(
                surname,
                name,
                secondName,
                age
        );
        human.setName("");
    }

    @Test(expected = NullPointerException.class)
    public void testClassException12() {
        String surname = "Doe";
        String name = "John";
        String secondName = "John";
        int age = 18;
        Human human = new Human(
                surname,
                name,
                secondName,
                age
        );
        human.setName(null);
    }

    @Test(expected = NullPointerException.class)
    public void testClassException13() {
        String surname = "Doe";
        String name = "John";
        String secondName = "John";
        int age = 18;
        Human human = new Human(
                surname,
                name,
                secondName,
                age
        );
        human.setMiddleName("");
    }

    @Test(expected = NullPointerException.class)
    public void testClassException14() {
        String surname = "Doe";
        String name = "John";
        String secondName = "John";
        int age = 18;
        Human human = new Human(
                surname,
                name,
                secondName,
                age
        );
        human.setMiddleName(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testClassException15() {
        String surname = "Doe";
        String name = "John";
        String secondName = "John";
        int age = 18;
        Human human = new Human(
                surname,
                name,
                secondName,
                age
        );
        human.setAge(-12);
    }
}
