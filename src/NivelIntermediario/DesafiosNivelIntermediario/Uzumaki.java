package NivelIntermediario.DesafiosNivelIntermediario;

public class Uzumaki extends Ninja{

    int quantidadeSupremaDeChackara = chackara + 10000000;
    boolean possuiTecnicaDeSelamento;


    @Override
    public void mostrarInformacoes(){
        System.out.println("O nome do ninja é " + nome + " sua idade é de " + idade);
        System.out.println("O ninja da familia Uzumaki possui " + quantidadeSupremaDeChackara + " de chackara , e possui a tecnica de selamento no estado " + possuiTecnicaDeSelamento);
        System.out.println("O status da missao é " + missao + " o nivel da missao é " + nivelDeDificuldade + " e o status dela é " + statusDaMissao );
    }
}
