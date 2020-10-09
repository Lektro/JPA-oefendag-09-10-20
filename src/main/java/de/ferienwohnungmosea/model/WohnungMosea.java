package de.ferienwohnungmosea.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class WohnungMosea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private boolean roomAvailable;

    // name probably not needed
    private String name;
    private int maxGuests;
    private int bookedGuests;
    private boolean normalBreakfast;
    private boolean deluxeBreakfast;
    private boolean guestHasDog;
    // private date?

    @OneToMany()
    private List<Guest> guests = new ArrayList<>();

    public WohnungMosea(int id, boolean roomAvailable, String name, int maxGuests, int bookedGuests, boolean normalBreakfast, boolean deluxeBreakfast, boolean guestHasDog) {
        this.id = id;
        this.roomAvailable = roomAvailable;
        this.name = name;
        this.maxGuests = maxGuests;
        this.bookedGuests = bookedGuests;
        this.normalBreakfast = normalBreakfast;
        this.deluxeBreakfast = deluxeBreakfast;
        this.guestHasDog = guestHasDog;

    }

    public void addGuest(Guest guest) {
        guests.add(guest);
        guest.setWohnungMosea(this);
    }

    public void removeGuest(Guest guest){
        guests.remove(guest);
        guest.setWohnungMosea(null);

    }

    public WohnungMosea() {

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public boolean isGuestHasDog() {
        return guestHasDog;
    }

    public void setGuestHasDog(boolean guestHasDog) {
        this.guestHasDog = guestHasDog;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WohnungMosea)) return false;
        WohnungMosea that = (WohnungMosea) o;
        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "WohnungMosea{" +
                "id=" + id +
                ", roomAvailable=" + roomAvailable +
                ", name='" + name + '\'' +
                ", maxGuests=" + maxGuests +
                ", bookedGuests=" + bookedGuests +
                ", normalBreakfast=" + normalBreakfast +
                ", deluxeBreakfast=" + deluxeBreakfast +
                ", guestHasDog=" + guestHasDog +
                ", guests=" + guests +
                '}';
    }
}
