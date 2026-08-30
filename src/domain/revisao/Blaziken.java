package domain.revisao;

public class Blaziken extends Pokemon implements FireType, FightType {

    public Blaziken(String name, Integer cp, Integer hp) {
        super(name, cp, hp);
    }

    @Override
    public void attack() {
        ember();
        closeCombat();
    }

    @Override
    public void comeBack() {
        System.out.println("Blaziken, volte!");
    }

    @Override
    public void iChooseYou() {
        System.out.println("Blaziken, eu escolho voce!");
    }

    @Override
    public void ember() {
        System.out.println("Blaziken ataca com ember!");
    }

    @Override
    public void closeCombat() {
        System.out.println("Blaziken ataca com Close Combat!");
    }
}
