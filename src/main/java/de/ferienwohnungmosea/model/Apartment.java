package de.ferienwohnungmosea.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Apartment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private boolean roomAvailable;
    // private String name;
    private int maxGuests;
    private int bookedGuests;
    // private boolean normalBreakfast;
    // private boolean deluxeBreakfast;
    // private boolean guestHasDog;
    // private date?

    @OneToMany()
    private List<Guest> guests = new ArrayList<>();

    public Apartment(int id, boolean roomAvailable, String name, int maxGuests, int bookedGuests, boolean normalBreakfast, boolean deluxeBreakfast, boolean guestHasDog) {
        this.id = id;
        this.roomAvailable = roomAvailable;
        this.maxGuests = maxGuests;
        this.bookedGuests = bookedGuests;
    }

    public void addGuest(Guest guest) {
        guests.add(guest);
        guest.setApartment(this);
    }

    public void removeGuest(Guest guest){
        guests.remove(guest);
        guest.setApartment(null);
    }

    public Apartment() {
    }

    public List<Guest> getGuests() {
        return guests;
    }

    public void setGuests(List<Guest> guests) {
        this.guests = guests;
    }

    public boolean isRoomAvailable() {
        return roomAvailable;
    }

    public void setRoomAvailable(boolean roomAvailable) {
        this.roomAvailable = roomAvailable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaxGuests() {
        return maxGuests;
    }

    public void setMaxGuests(int maxGuests) {
        this.maxGuests = maxGuests;
    }

    public int getBookedGuests() {
        return bookedGuests;
    }

    public void setBookedGuests(int bookedGuests) {
        this.bookedGuests = bookedGuests;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Apartment)) return false;
        Apartment that = (Apartment) o;
        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "id=" + id +
                ", roomAvailable=" + roomAvailable +
                ", maxGuests=" + maxGuests +
                ", bookedGuests=" + bookedGuests +
                ", guests=" + guests +
                '}';
    }
}
