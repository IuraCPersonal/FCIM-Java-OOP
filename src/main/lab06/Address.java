package main.lab06;

public class Address {
    String address;

    public Address(String streetName, String houseNumber) {
        address = streetName + ", " + houseNumber;
    }

    public String getAddress() {
        return this.address;
    }
}
