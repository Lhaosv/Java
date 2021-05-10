package equalsPackage;

import java.util.Objects;

public class Address {
    String city;
    String street;

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public Address() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(city, address.city) && Objects.equals(street, address.street);
    }
}
