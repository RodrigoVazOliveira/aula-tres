package br.com.zup.aulatres.controllers;

import br.com.zup.aulatres.models.Soma;
import br.com.zup.aulatres.services.MatematicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/matematica/")
public class MatematicaController {

    @Autowired
    private MatematicaService service;

//    curl -v -i -d '{"numeros": [1,2,3,4,5,6,7,8,9]}' localhost:8080/matematica/soma/ -H "Content-Type: application/json"
    @PostMapping("soma/")
    public int soma(@RequestBody Soma objSoma) {
        return service.soma(objSoma);
    }

}
