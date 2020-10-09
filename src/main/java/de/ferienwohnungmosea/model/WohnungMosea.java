package de.ferienwohnungmosea.model;

import javax.persistence.*;
import java.util.Objects;

@Entity (name = "apartment")
public class WohnungMosea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private boolean roomAvailable;
    private String name;
    private int maxGuests;
    private int bookedGuests;
    private boolean normalBreakfast;
    private boolean deluxeBreakfast;
    private boolean guestHasDog;

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

    public WohnungMosea() {

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
                '}';
    }
}
