package br.com.zup.aulatres.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/matematica/")
public class MatematicaController {

    @GetMapping("soma/")
    public Integer soma() {
        return 4404 + 2202;
    }
    
}
