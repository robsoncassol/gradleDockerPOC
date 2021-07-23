package com.accesso.GradlePOC;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GradlePocController {

    @GetMapping("hello")
    public String helloWorld(){

        return "Hello world";
    }

}
