package com.example.gticslab420210751.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/RecursosHumanos–GTICS")
    public String recursosHumanos() {
        return "RecursosHumanos";
    }


}
