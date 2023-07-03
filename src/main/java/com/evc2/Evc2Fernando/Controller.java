package com.example.HolaCodespacesL7;

import java.lang.String;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(path="/")
public class Controller{

    @GetMapping(path="/")
    public String home(){
        return "PT72528736 - Julio Rivero";
    }

    @GetMapping(path="/idat/codigo")
    public  String codigo(){
        return "PT72528736";
    }

    @GetMapping(path="/idat/nombre-completo")
    public String nombrecompleto(){
        return "Julio Aldair Rivero Crisostomo";
    }

    
}