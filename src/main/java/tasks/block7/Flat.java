package tasks.block7;

import java.util.List;
import java.util.Objects;

public class Flat {
    private int number;
    private float square;
    private List<Person> personList;

    public Flat(int number, float square, List<Person> personList) {
        this.number = number;
        this.square = square;
        this.personList = personList;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public float getSquare() {
        return square;
    }

    public void setSquare(float square) {
        this.square = square;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flat flat = (Flat) o;
        return number == flat.number && Float.compare(flat.square, square) == 0 && Objects.equals(personList, flat.personList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, square, personList);
    }
}
