package de.ferienwohnungmosea.main;

import de.ferienwohnungmosea.model.Apartment;
import de.ferienwohnungmosea.model.Guest;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;

public class DevTestMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = null;
        EntityManager em = null;

        try {
            emf = Persistence.createEntityManagerFactory("create");
            em = emf.createEntityManager();
            EntityTransaction tx = em.getTransaction();
            tx.begin();

            Apartment wm = new Apartment();
            wm.setBookedGuests(2);
            wm.setMaxGuests(4);
            wm.setRoomAvailable(false);

            Guest g = new Guest();
            g.setFirstName("Kevin");
            g.setLastName("van der Kruk");
            g.setAddress("Fabeltjes Laan 26 bus 3, 1000 Brussel");
            g.setEmail("okedan@mailserver.de");
            g.setTelephoneNumber("0032 3 666 55 99");
            g.setDogOwner(false);
            g.setDeluxeBreakfast(true);
            LocalDate arrival = LocalDate.of(2020,10,25);
            LocalDate departure =  LocalDate.of(2020,11,02);
            g.setArrivalDate(arrival);
            g.setDepartureDate(departure);
            g.setApartment(wm);
            wm.addGuest(g);

            Guest gOne = new Guest ();
            gOne.setFirstName("Joey");
            gOne.setDogOwner(true);
            wm.addGuest(gOne);

            em.persist(g);
            em.persist(gOne);
            em.persist(wm);

            tx.commit();
        } finally {
            if (em != null)
                em.close();
            if (emf != null)
                emf.close();
        }
    }
}
