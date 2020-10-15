package de.ferienwohnungmosea.controller;

import de.ferienwohnungmosea.model.DateRange;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping({ "/", "/index" })
public class IndexController {

    @GetMapping
    public String main(Model model) {
        DateRange dateRange = new DateRange();
        dateRange.setDateFrom(new Date());
        dateRange.setDateTo(new Date());
        model.addAttribute("dateRange", dateRange);
        return "index";
    }

    @PostMapping
    public String save(DateRange dateRange, Model model) {
        model.addAttribute("dateRange", dateRange);
        return "saved";
    }

}
