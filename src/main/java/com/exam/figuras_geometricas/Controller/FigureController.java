package com.exam.figuras_geometricas.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/figure")
public class FigureController {

    @GetMapping("/circulo")
    public String figura(){
        return "Haz escogido el circulo";
    }
}
