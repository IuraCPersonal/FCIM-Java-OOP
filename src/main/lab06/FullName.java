package main.lab06;

public class FullName {
    String fullName;

    public FullName(String givenName, String middleName, String familyName) {
        fullName = givenName + " " + middleName + " " + familyName;
    }

    public String getName() {
        return this.fullName;
    }
}
