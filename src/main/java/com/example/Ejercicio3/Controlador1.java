package com.example.Ejercicio3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class Controlador1 {

    @GetMapping("/a")
    public String getSaludo(){
        return "Hola mundo";
    }
}


