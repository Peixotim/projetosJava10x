package NivelIntermediario.DesafiosNivelIntermediario;

public class Hyugga extends Ninja{

    boolean estadoDoByakugan;

    @Override
    public void mostrarInformacoes(){
        System.out.println("O nome do ninja é " + nome + " sua idade é de " + idade);
        System.out.println("O ninja da familia hyugga tem o byakugan no estado " + estadoDoByakugan);
        System.out.println("O status da missao é " + missao + " o nivel da missao é " + nivelDeDificuldade + " e o status dela é " + statusDaMissao );
    }
}
