package br.com.zup.aulatres.controllers;

import br.com.zup.aulatres.models.MediaPonderada;
import br.com.zup.aulatres.services.MediaPonderadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/media/")
public class MediaPonderadaController {

    @Autowired
    private MediaPonderadaService service;

    @PostMapping("/calcular/")
    public Integer media(@RequestBody MediaPonderada mediaPonderada) {
        return service.calcularMediaPonderada(mediaPonderada);
    }

}
