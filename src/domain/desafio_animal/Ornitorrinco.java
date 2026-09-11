package domain.desafio_animal;

public class Ornitorrinco extends Animal implements Mamifero, BotaOvos {
    public Ornitorrinco(String animalNome) {super(animalNome);}

    @Override
    public void comer() { System.out.println("Ornitorrinco esta comendo."); }

    @Override
    public void dormir() { System.out.println("Ornitorrinco esta dormindo."); }

    @Override
    public void emitirSom() {
        System.out.println("Ornitorrinco esta emitindo seu som.");
    }

    @Override
    public void botarOvos() { System.out.println("Ornitorrinco esta botando ovos."); }
}
