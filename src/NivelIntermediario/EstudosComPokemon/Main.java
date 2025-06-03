package NivelIntermediario.EstudosComPokemon;

public class Main {
    public static void main(String[] args) {
        Fogo Charizard = new Fogo();

        Charizard.nome = "Charizard";
        Charizard.nivel = 100;
        Charizard.tipoPokemon();

        Agua Squirtle = new Agua();
        Squirtle.nome = "Squirtle";
        Squirtle.nivel = 20;
        Squirtle.tipoPokemon();

        Planta Treecko = new Planta();
        Treecko.nome = "Treecko";
        Treecko.nivel = 20;
        Treecko.tipoPokemon();
    }
}
