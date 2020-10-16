package de.ferienwohnungmosea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class IndexController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="NOOB")String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

}
