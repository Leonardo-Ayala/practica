package com.example.demojavascript;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {
    @GetMapping(value = "")
    public String main(){
        return "listaHRjson";
    }
}
