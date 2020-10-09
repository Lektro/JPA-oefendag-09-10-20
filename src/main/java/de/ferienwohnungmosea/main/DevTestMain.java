package de.ferienwohnungmosea.main;

import de.ferienwohnungmosea.models.WohnungMosea;

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
            wm.setBookedGuests(2);
            wm.setMaxGuests(4);
            wm.setDeluxeBreakfast(true);
            wm.setGuestHasDog(false);

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
