package de.ferienwohnungmosea.controller;


import de.ferienwohnungmosea.model.Guest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping({ "/", "/index" })
public class IndexController {


    @GetMapping("/addGuest")
    public ModelAndView guestForm (Model model) {
        model.addAttribute("addGuest", new Guest());
        return new ModelAndView("addGuest");
    }


}
