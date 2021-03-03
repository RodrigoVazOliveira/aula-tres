package br.com.zup.aulatres.models;

import java.util.List;

public class MediaPonderada {

    private List<Integer> notas;
    private List<Integer> pesos;

    public MediaPonderada() {
    }

    public List<Integer> getNotas() {
        return notas;
    }

    public void setNotas(List<Integer> notas) {
        this.notas = notas;
    }

    public List<Integer> getPesos() {
        return pesos;
    }

    public void setPesos(List<Integer> pesos) {
        this.pesos = pesos;
    }
}
