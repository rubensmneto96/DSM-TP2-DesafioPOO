package domain.revisao;

import java.util.Objects;

public abstract class Pokemon {
    private String name;
    private Integer cp;
    private Integer hp;

    public Pokemon(String name, Integer cp, Integer hp) {
        setName(name);
        setCp(cp);
        setHp(hp);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (Objects.isNull(name) || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name não pode ser nulo ou vazio");
        }
        this.name = name;
    }

    public Integer getCp() {
        return cp;
    }

    public void setCp(Integer cp) {
        if (Objects.isNull(cp) || cp < 0) {
            throw new IllegalArgumentException("CP não pode ser nulo ou negativo");
        }
        this.cp = cp;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        if (Objects.isNull(hp) || hp < 0) {
            throw new IllegalArgumentException("HP não pode ser nulo ou negativo");
        }
        this.hp = hp;
    }

    public abstract void attack();

    public abstract void comeBack();

    public abstract void iChooseYou();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", cp=" + cp +
                ", hp=" + hp +
                '}';
    }
}
