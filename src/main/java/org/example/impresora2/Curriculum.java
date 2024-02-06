package org.example.impresora2;

public class Curriculum extends Documento{

    public String[] getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String[] habilidades) {
        this.habilidades = habilidades;
    }

    private String[] habilidades;

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo curriculum");
    }


}
