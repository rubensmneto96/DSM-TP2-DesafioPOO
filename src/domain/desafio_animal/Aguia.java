package domain.desafio_animal;

public class Aguia extends Animal implements Ave, Voavel, BotaOvos {
    public Aguia(String animalNome) {
        super(animalNome);
    }

    @Override
    public void comer() {
        System.out.println("Aguia esta comendo.");
    }

    @Override
    public void dormir() {
        System.out.println("Aguia esta dormindo.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Aguia esta emitindo seu som.");
    }

    @Override
    public void voar() {
        System.out.println("Aguia esta voando bem alto.");
    }

    @Override
    public void botarOvos() { System.out.println("Aguia esta botando ovos."); }
}
