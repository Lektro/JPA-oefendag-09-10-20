package de.ferienwohnungmosea.main;

import de.ferienwohnungmosea.model.Guest;
import de.ferienwohnungmosea.model.WohnungMosea;
import javax.persistence.*;

public class DevTestMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = null;
        EntityManager em = null;

        try {
            emf = Persistence.createEntityManagerFactory("create");
            em = emf.createEntityManager();
            EntityTransaction tx = em.getTransaction();
            tx.begin();

            WohnungMosea wm = new WohnungMosea();
            wm.setName("Ferienwohnung Mosea");
            wm.setBookedGuests(1);
            wm.setMaxGuests(4);
            wm.setDeluxeBreakfast(true);
            wm.setGuestHasDog(false);
            wm.setRoomAvailable(true);

            Guest g = new Guest();
            g.setFirstName("Kevin");
            g.setLastName("van der Kruk");
            g.setAddress("Fabeltjes Laan 26 bus 3, 1000 Brussel");
            g.setEmail("okedan@mailserver.de");
            g.setTelephoneNumber("0032 3 666 55 99");
            g.setReservationValid(true);
            wm.addGuest(g);

            Guest gOne = new Guest ();
            gOne.setFirstName("Joey");
            gOne.setReservationValid(true);
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
