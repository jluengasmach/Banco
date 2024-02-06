package org.example.animales3;

public class Vaca extends Animal implements Herbivoro {
    @Override
    public void emitirSonido() {
        System.out.println("Muuuu");
    }

    @Override
    public void comerHierba() {
        System.out.println("Comiendo hierbas");
    }
}
