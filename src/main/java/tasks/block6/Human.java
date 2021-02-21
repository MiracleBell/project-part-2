package tasks.block6;

import java.util.Objects;

public class Human {
    private String surname;
    private String name;
    private String middleName;
    private int age;

    public Human(String surname, String name, String middleName, int age) {
        setSurname(surname);
        setName(name);
        setMiddleName(middleName);
        setAge(age);
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getAge() {
        return age;
    }

    public void setSurname(String surname) {
        if (surname == null || surname.equals("")) {
            throw new NullPointerException("Field 'surname' can't be empty");
        }
        this.surname = surname;
    }

    public void setName(String name) {
        if (name == null || name.equals("")) {
            throw new NullPointerException("Field 'name' can't be empty");
        }
        this.name = name;
    }

    public void setMiddleName(String middleName) {
        if (middleName == null || middleName.equals("")) {
            throw new NullPointerException("Field 'middleName' can't be empty");
        }
        this.middleName = middleName;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Field 'age' can't be smaller than 0");
        }
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(surname, human.surname) && Objects.equals(name, human.name) && Objects.equals(middleName, human.middleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name, middleName, age);
    }
}
