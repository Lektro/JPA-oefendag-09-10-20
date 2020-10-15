package de.ferienwohnungmosea.controller;


import de.ferienwohnungmosea.model.Guest;
import de.ferienwohnungmosea.services.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping({ "/", "/index" })
public class IndexController {

    @Autowired
    GuestService guestService;

    @GetMapping("/")
    public ModelAndView guest (Model model) {
        model.addAttribute("guest", new Guest());
        return new ModelAndView("/");
    }
    @PostMapping("/")
    public ModelAndView addGuest(@ModelAttribute("guest") Guest guest) {
        guestService.addGuest(guest);
        return new ModelAndView("redirect:/addGuest");
    }
}
