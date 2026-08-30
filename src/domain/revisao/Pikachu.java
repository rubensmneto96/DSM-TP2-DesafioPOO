package domain.revisao;

// Classes são estruturas que definem atributos e comportamento
public class Pikachu extends Pokemon implements ElectricType {

    private Integer defense;

    public Pikachu(String name, Integer cp, Integer hp, Integer defense) {
        super(name, cp, hp);
        this.setDefense(defense);
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        if (defense == null) {
            throw new IllegalArgumentException("Defense não pode ser nulo");
        }
        this.defense = defense;
    }

    @Override
    public void attack() {
        thunderbolt();
    }

    @Override
    public void comeBack() {
        System.out.println("Pikachu, volte!");
    }

    @Override
    public void iChooseYou() {
        System.out.println("Pikachu, eu escolho voce!");
    }

    @Override
    public void thunderbolt() {
        System.out.println("Pikachu ataca com Thunderbolt!");
    }

}
