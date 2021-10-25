package entity;

import java.io.Serializable;
import java.util.Objects;

public class Passenger implements Serializable {
    String name;
    String surname;

    public Passenger(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Passenger() {
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passenger passenger = (Passenger) o;
        return name.equals(passenger.name) && surname.equals(passenger.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}
