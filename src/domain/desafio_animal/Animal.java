package domain.desafio_animal;

import java.util.Objects;

public abstract class Animal {
    private String animalNome;

    public Animal (String animalNome){
        setAnimalNome(animalNome);
    }

    public String getAnimalNome(){ return animalNome;}

    public void setAnimalNome(String animalNome){
        if (Objects.isNull(animalNome) || animalNome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do animal nao pode ser nulo ou vazio!");
        }
        this.animalNome = animalNome;
    }

    public abstract void comer();

    public abstract void dormir();

    public abstract void emitirSom();

    public String toString(){
        return this.getClass().getSimpleName() + " {Animal: " + animalNome + "}";
    }
}
