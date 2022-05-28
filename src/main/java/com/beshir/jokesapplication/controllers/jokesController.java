package com.beshir.jokesapplication.controllers;


import com.beshir.jokesapplication.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class jokesController {
    final private JokesService jokesService;

    public jokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }


    @RequestMapping({"/",""})
    public String showJoke(Model model){
        model.addAttribute("joke",jokesService.getJokes());
        return  "index";
    }
}
