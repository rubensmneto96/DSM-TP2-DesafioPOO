package domain.revisao;

public class Squirtle extends Pokemon implements WaterType {
    public Squirtle(String name, Integer cp, Integer hp) { super(name, cp, hp); }

    @Override
    public void attack() {
        splash();
    }

    @Override
    public void comeBack() {
        System.out.println("Squirtle, volte!");
    }

    @Override
    public void iChooseYou() {
        System.out.println("Squirtle, eu escolho voce!");
    }

    @Override
    public void splash() {
        System.out.println("Squirtle ataca com Splash!");
    }
}
