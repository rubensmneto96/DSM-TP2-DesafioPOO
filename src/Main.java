import domain.designpattern.*;
import domain.revisao.*;
import domain.desafio_animal.*;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        //TODO: Exemplos de código para revisão de conceitos de programação orientada a objetos

        //Desafio 01: POKEMON
        System.out.println("\n\n ######## DESAFIO 01 - POKEMON ######## \n\n");

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

        //Desafio 02: ANIMAIS
        System.out.println("\n\n ######## DESAFIO 02 - ANIMAIS ######## \n\n");

        var aguia = new Aguia("Aguia");

        var leao = new Leao("Leao");

        var morcego = new  Morcego("Morcego");

        var bichoPreguica = new BichoPreguica("BichoPreguica");

        var ornitorrinco = new Ornitorrinco("Ornitorrinco");

        var pinguin = new Pinguin("Pinguin");

        List<Animal> animais = Arrays.asList(aguia, leao, morcego, bichoPreguica, ornitorrinco, pinguin);
        String animalTemplate = "\n%s. Detalhes de heraça e polimorfismo. \n"+
                "\tInstancia de Animal: %s.\n"+
                "\tInstancia de Ave: %s.\n"+
                "\tInstancia de Mamifero: %s.\n"+
                "\tInstancia de Voavel: %s. \n"+
                "\tInstancia de Patrulhavel: %s. \n"+
                "\tInstancia de BotaOvos: %s. \n\n";

        animais.forEach(a -> {
            System.out.printf(animalTemplate, a.getAnimalNome(),
                    (a instanceof Animal),
                    (a instanceof Ave),
                    (a instanceof Mamifero),
                    (a instanceof Voavel),
                    (a instanceof Patrulhavel),
                    (a instanceof BotaOvos));
            a.comer();
            a.dormir();
            a.emitirSom();

            if (a instanceof Voavel) {
                ((Voavel) a).voar();
            }

            if (a instanceof Patrulhavel) {
                ((Patrulhavel) a).patrulhar();
            }

            if (a instanceof BotaOvos) {
                ((BotaOvos) a).botarOvos();
            }

            if (Objects.equals(a.getAnimalNome(), "BichoPreguica")) {
                ((BichoPreguica) a).andaNaArvore();
            }

            if (Objects.equals(a.getAnimalNome(), "Pinguin")) {
                ((Pinguin) a).nadar();
            }

        });
    }
}