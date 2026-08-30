package domain.revisao;

public class Zapdos extends Pokemon implements ElectricType, FlyingType {
    public Zapdos(String name, Integer cp, Integer hp) {
        super(name, cp, hp);
    }

    @Override
    public void thunderbolt() {
        System.out.println("Zapdos ataca com Thunderbolt!");
    }

    @Override
    public void wingAttack() {
        System.out.println("Zapdos ataca com Wing Attack!");
    }

    @Override
    public void attack() {
        thunderbolt();
        wingAttack();
    }

    @Override
    public void comeBack() {
        System.out.println("Zapdos, volte!");
    }

    @Override
    public void iChooseYou() {
        System.out.println("Zapdos, eu escolho voce!");
    }
}
