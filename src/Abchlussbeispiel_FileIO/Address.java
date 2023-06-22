package Abchlussbeispiel_FileIO;

public class Address {
    private String firstName;
    private String lastName;
    private String mobilNummer;
    private String email;

    public Address(String firstName, String lastName, String mobilNummer, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobilNummer = mobilNummer;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobilNummer() {
        return mobilNummer;
    }

    public void setMobilNummer(String mobilNummer) {
        this.mobilNummer = mobilNummer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return firstName + "; " +
                lastName + "; " +
                mobilNummer + "; " +
                email + ';';
    }
}
