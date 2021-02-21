package tasks.block9;

import java.util.Objects;

public class Human {
    private String surname;
    private String name;
    private String secondName;
    private int age;
    private Gender gender;

    public Human(String surname, String name, String secondName, int age, Gender gender) {
        if (surname == null || surname.equals("")) {
            throw new NullPointerException();
        }
        if (name == null || name.equals("")) {
            throw new NullPointerException();
        }
        if (secondName == null || secondName.equals("")) {
            throw new NullPointerException();
        }
        if (age < 0) {
            throw new IllegalArgumentException();
        }
        if (gender == null) {
            throw new NullPointerException();
        }
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.gender = gender;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(surname, human.surname) && Objects.equals(name, human.name) && Objects.equals(secondName, human.secondName) && gender == human.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name, secondName, age, gender);
    }
}
