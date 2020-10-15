package de.ferienwohnungmosea.dao;

import de.ferienwohnungmosea.model.Apartment;
import de.ferienwohnungmosea.model.Guest;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@Repository
public class GuestDAOImpl {


    public void addGuest(Guest guest){
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
            //LocalDate arrival = LocalDate.of(2020,10,25);
            //LocalDate departure =  LocalDate.of(2020,11,02);
            g.setArrivalDate("22/10/2020");
            g.setDepartureDate("25/10/20");
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
