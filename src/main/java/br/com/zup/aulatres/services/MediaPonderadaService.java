package br.com.zup.aulatres.services;

import br.com.zup.aulatres.models.MediaPonderada;
import org.springframework.stereotype.Service;

@Service
public class MediaPonderadaService {

    public Integer calcularMediaPonderada(MediaPonderada mediaPonderada) {
        Integer somaPeso = 0;

        for (Integer peso : mediaPonderada.getPesos()) {
            somaPeso += peso;
        }

        Integer pesoXNota = 0;
        Integer sizenota = 0;
        for (Integer peso : mediaPonderada.getPesos()) {
            pesoXNota += peso * mediaPonderada.getNotas().get(sizenota);
            sizenota++;
        }
        return pesoXNota / somaPeso;
    }
}
