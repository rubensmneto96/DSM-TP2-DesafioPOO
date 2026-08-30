import domain.designpattern.*;
import domain.revisao.*;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //TODO: Exemplos de código para revisão de conceitos de programação orientada a objetos
        Pikachu pikachu = new Pikachu("Pikachu", 800, 3000, 900);
        System.out.println(pikachu);
        pikachu.iChooseYou();
        pikachu.attack();
        pikachu.comeBack();

        var charmander = new Charmander("Charmander", 500, 3000);
        System.out.println(charmander);
        charmander.iChooseYou();
        charmander.attack();
        charmander.comeBack();

        var zapdos = new Zapdos("Zapdos", 800, 30000);
        System.out.println(zapdos);
        zapdos.iChooseYou();
        zapdos.attack();
        zapdos.comeBack();

        var blaziken = new Blaziken("Blaziken", 700, 10000);
        System.out.println(blaziken);
        blaziken.iChooseYou();
        blaziken.attack();
        blaziken.comeBack();

        var squirtle = new Squirtle("Squirtle", 500, 3000);
        System.out.println(squirtle);
        squirtle.iChooseYou();
        squirtle.attack();
        squirtle.comeBack();

        // Demonstração do Polimorfismo
        List<Pokemon> pokemons = Arrays.asList(pikachu, charmander, zapdos, blaziken, squirtle);
        String template = "\n%s. Detalhes de heraça e polimorfismo. \n"+
                "\tInstancia de Pokemon: %s.\n"+
                "\tInstancia de FireType: %s.\n"+
                "\tInstancia de ElectricType: %s.\n"+
                "\tInstancia de FlyingType: %s. \n"+
                "\tInstancia de FightType: %s. \n"+
                "\tInstancia de WaterType: %s. \n\n";

        pokemons.forEach(p -> {
            System.out.printf(template, p.getName(),
                    (p instanceof Pokemon),
                    (p instanceof FireType),
                    (p instanceof ElectricType),
                    (p instanceof FlyingType),
                    (p instanceof FightType),
                    (p instanceof  WaterType));
            p.attack();
        });
    }
}