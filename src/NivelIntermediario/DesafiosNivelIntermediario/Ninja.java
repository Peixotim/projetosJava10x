package NivelIntermediario.DesafiosNivelIntermediario;

public class Ninja {
    String nome;
    String missao;
    String nivelDeDificuldade;
    String statusDaMissao;
    int chackara;
    int idade;

    public void mostrarInformacoes(){
        System.out.println("O nome do ninja é " + nome + " sua idade é de " + idade);
        System.out.println("O status da missao é " + missao + " o nivel da missao é " + nivelDeDificuldade + " e o status dela é " + statusDaMissao );
    }
}
