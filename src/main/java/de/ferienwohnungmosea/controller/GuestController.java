package de.ferienwohnungmosea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GuestController {

    @GetMapping("/addguest")
    public ModelAndView showAddGuest (ModelMap modelMap) {
        return new ModelAndView("addguest");
    }

    public String greeting(@RequestParam(name="name", required=false, defaultValue="NOOB")String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}
