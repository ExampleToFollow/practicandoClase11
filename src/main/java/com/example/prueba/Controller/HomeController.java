package com.example.prueba.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping(value="/form")
    public String getVistaInicial(){
        return "/vistaInicial";
    }
    @GetMapping(value="/lista")
    public String getVistaLista(){
        return "/lista";
    }
}
