package domain.desafio_animal;

public class Pinguin extends Animal implements Ave, BotaOvos{
    public Pinguin(String animalNome) {super(animalNome);}

    @Override
    public void comer() {
        System.out.println("Pinguin esta comendo.");
    }

    @Override
    public void dormir() {
        System.out.println("Pinguin esta dormindo.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Pinguin esta emitindo seu som.");
    }

    @Override
    public void botarOvos() {
        System.out.println("Pinguin esta botando ovos.");
    }

    public void nadar() {
        System.out.println("Pinguin esta nadando.");
    }
}
