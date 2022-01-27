package com.douglas.springvscode.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Hello Controler
 */
@RestController
public class hellocontroler {

    @GetMapping(value="/")
    public String getMethodName() {
        return "Olá Mundo VCCode!";
    }
    
}
