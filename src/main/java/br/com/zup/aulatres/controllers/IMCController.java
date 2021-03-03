package br.com.zup.aulatres.controllers;

import br.com.zup.aulatres.models.IMC;
import br.com.zup.aulatres.services.IMCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/imc/")
public class IMCController {

    @Autowired
    private IMCService service;

    @PostMapping("/calcular/")
    public double calcularIMC(@RequestBody IMC imc) {
        return service.calcularIMC(imc);
    }
}
