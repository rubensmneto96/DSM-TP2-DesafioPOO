package domain.desafio_animal;

public class Leao extends Animal implements Mamifero, Patrulhavel {
    public Leao(String animalNome) {
        super(animalNome);
    }

    @Override
    public void comer() {
        System.out.println("Leao esta comendo.");
    }

    @Override
    public void dormir() {
        System.out.println("Leao esta dormindo.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Leao esta rugindo.");
    }

    @Override
    public void patrulhar() {
        System.out.println("Leao esta patrulhando.");
    }
}
