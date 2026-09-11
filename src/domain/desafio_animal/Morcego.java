package domain.desafio_animal;

public class Morcego extends Animal implements Mamifero, Voavel {
    public Morcego(String animalNome){
        super(animalNome);
    }

    @Override
    public void comer() {
        System.out.println("Morcego esta comendo.");
    }

    @Override
    public void dormir() {
        System.out.println("Morcego esta dormindo.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Morcego esta emitido sons caracteristicos.");
    }

    @Override
    public void voar() {
        System.out.println("Morcego apesar de ser mamifero, ele tambem voa!");
    }
}
