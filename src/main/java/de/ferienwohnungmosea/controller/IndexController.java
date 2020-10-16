package de.ferienwohnungmosea.controller;


import de.ferienwohnungmosea.model.Guest;
import de.ferienwohnungmosea.services.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class IndexController {

    @Autowired
    GuestService guestService;

    @GetMapping("/addGuest")
    public String greeting(@RequestParam(name="name", required = false, defaultValue = "NOOB")String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

/*    @GetMapping("/addGuest")
    public ModelAndView addGuest (Model model) {
        model.addAttribute("guest", new Guest());
        return new ModelAndView("addGuest");
    }*/
}
