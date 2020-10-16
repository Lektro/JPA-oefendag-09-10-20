package de.ferienwohnungmosea.controller;

import de.ferienwohnungmosea.model.Guest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GuestController {

    @GetMapping("/addguest")
    public ModelAndView showAddGuest (ModelMap modelMap) {
        return new ModelAndView("addguest");
    }
    @GetMapping("/form")
    public ModelAndView showForm (ModelMap modelMap) {
        return new ModelAndView("/form");
    }
}
