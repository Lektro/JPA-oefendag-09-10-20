package de.ferienwohnungmosea.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // reservation valid needs dates?
    private boolean reservationValid;
    private String firstName;
    private String lastName;

    // separate class for address details?
    private String address;

    private String email;
    private String telephoneNumber;

    private boolean dogOwner;
    // separate class for different types of breakfast?
    // if breakfast is true read back the guest choice standard or deluxe

    // still to add
    // private boolean normalBreakfast;
    // private boolean deluxeBreakfast;
    // private boolean guestHasDog;


    @ManyToOne
    private Apartment apartment;

    public Guest (int id, boolean reservationValid, String firstName, String lastName, String address, String email, String telephoneNumber) {
    }

    public Guest () {
    }

    public boolean isDogOwner() {
        return dogOwner;
    }

    public void setDogOwner(boolean dogOwner) {
        this.dogOwner = dogOwner;
    }

    public Apartment getApartment() {
        return apartment;
    }

    public void setApartment(Apartment apartment) {
        this.apartment = apartment;
    }

    public boolean isReservationValid() {
        return reservationValid;
    }

    public void setReservationValid(boolean reservationValid) {
        this.reservationValid = reservationValid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Guest)) return false;
        Guest guest = (Guest) o;
        return getId() == guest.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Guest{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                '}';
    }
}
