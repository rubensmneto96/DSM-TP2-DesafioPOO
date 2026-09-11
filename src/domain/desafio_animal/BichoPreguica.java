package domain.desafio_animal;

public class BichoPreguica extends Animal implements Mamifero {
    public BichoPreguica(String animalNome) {
        super(animalNome);
    }

    @Override
    public void comer() {
        System.out.println("Bicho Preguica esta comendo.");
    }

    @Override
    public void dormir() {
        System.out.println("Bicho Preguica esta dormindo.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Bicho Preguica esta emitindo seu som.");
    };

    public void andaNaArvore() {
        System.out.println("Bicho Preguica anda em cima da arvore.");
    }
}
