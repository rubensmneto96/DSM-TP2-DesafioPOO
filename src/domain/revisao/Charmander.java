package domain.revisao;

public class Charmander extends Pokemon implements FireType {

    public Charmander(String name, Integer cp, Integer hp) {
        super(name, cp, hp);
    }

    @Override
    public void attack() {
        ember();
    }

    @Override
    public void comeBack() {
        System.out.println("Charmander, volte!");
    }

    @Override
    public void iChooseYou() {
        System.out.println("Charmander, eu escolho voce!");
    }

    @Override
    public void ember() {
        System.out.println("Charmander ataca com Ember!");
    }
}

