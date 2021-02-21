package tasks.block7;

import java.util.List;
import java.util.Objects;

public class House {
    private String cadasterNumber;
    private String address;
    private Person housekeeper;
    private List<Flat> flats;

    public House(String cadasterNumber, String address, Person housekeeper, List<Flat> flats) {
        this.cadasterNumber = cadasterNumber;
        this.address = address;
        this.housekeeper = housekeeper;
        this.flats = flats;
    }

    public String getCadasterNumber() {
        return cadasterNumber;
    }

    public void setCadasterNumber(String cadasterNumber) {
        this.cadasterNumber = cadasterNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person getHousekeeper() {
        return housekeeper;
    }

    public void setHousekeeper(Person housekeeper) {
        this.housekeeper = housekeeper;
    }

    public List<Flat> getFlats() {
        return flats;
    }

    public void setFlats(List<Flat> flats) {
        this.flats = flats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return Objects.equals(cadasterNumber, house.cadasterNumber) && Objects.equals(address, house.address) && Objects.equals(housekeeper, house.housekeeper) && Objects.equals(flats, house.flats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cadasterNumber, address, housekeeper, flats);
    }
}
