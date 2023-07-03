package com.evc2.Evc2Fernando;

import java.lang.String;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(path="/")
public class Controller{

    @GetMapping(path="/")
    public String home(){
        return "A20101890 - Fernando Espinoza";
    }

    @GetMapping(path="/idat/codigo")
    public  String codigo(){
        return "A20101890";
    }

    @GetMapping(path="/idat/nombre-completo")
    public String nombrecompleto(){
        return "Fernando Manuel Espinoza Salvatierra";
    }

    
}