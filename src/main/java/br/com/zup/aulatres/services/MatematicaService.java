package br.com.zup.aulatres.services;

import br.com.zup.aulatres.models.Soma;
import org.springframework.stereotype.Service;

@Service
public class MatematicaService {

    public Integer soma(Soma soma) {
        Integer resultado = 0;

        for (Integer s : soma.getNumeros()) {
            resultado += s;
        }

        return resultado;
    }

}
