package tasks.block7;

import java.util.Objects;

public class Person {
    private String surname;
    private String name;
    private String secondName;
    private String dateBirthday;

    public Person(String surname, String name, String secondName, String dateBirthday) {
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.dateBirthday = dateBirthday;
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

    public String getDateBirthday() {
        return dateBirthday;
    }

    public void setDateBirthday(String dateBirthday) {
        this.dateBirthday = dateBirthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(surname, person.surname) && Objects.equals(name, person.name) && Objects.equals(secondName, person.secondName) && Objects.equals(dateBirthday, person.dateBirthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name, secondName, dateBirthday);
    }
}
