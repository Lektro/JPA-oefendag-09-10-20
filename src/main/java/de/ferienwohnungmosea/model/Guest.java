package de.ferienwohnungmosea.model;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

@Entity
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private LocalDate arrivalDate;
    private LocalDate departureDate;
    private String firstName;
    private String lastName;

    // separate class for address details?
    private String address;

    private String email;
    private String telephoneNumber;

    private boolean dogOwner;
    private boolean normalBreakfast;
    private boolean deluxeBreakfast;
    private float totalPrice;

    @ManyToOne
    private Apartment apartment;

    public Guest (int id, boolean reservationValid, String firstName, String lastName, String address, String email, String telephoneNumber) {
    }

    public Guest () {
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public boolean isNormalBreakfast() {
        return normalBreakfast;
    }

    public void setNormalBreakfast(boolean normalBreakfast) {
        this.normalBreakfast = normalBreakfast;
    }

    public boolean isDeluxeBreakfast() {
        return deluxeBreakfast;
    }

    public void setDeluxeBreakfast(boolean deluxeBreakfast) {
        this.deluxeBreakfast = deluxeBreakfast;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
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
                ", arrivalDate=" + arrivalDate +
                ", departureDate=" + departureDate +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", dogOwner=" + dogOwner +
                ", normalBreakfast=" + normalBreakfast +
                ", deluxeBreakfast=" + deluxeBreakfast +
                ", totalPrice=" + totalPrice +
                ", apartment=" + apartment +
                '}';
    }
}
