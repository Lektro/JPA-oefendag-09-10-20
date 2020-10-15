package de.ferienwohnungmosea.services;

import de.ferienwohnungmosea.dao.GuestDAO;
import de.ferienwohnungmosea.model.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuestServiceImpl {
    @Autowired
    GuestDAO guestDAO;

    public void addGuest(Guest guest) {
        guestDAO.addGuest(guest);
    }
}
