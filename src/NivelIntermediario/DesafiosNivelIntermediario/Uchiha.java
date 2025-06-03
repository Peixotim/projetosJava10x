package NivelIntermediario.DesafiosNivelIntermediario;

import org.w3c.dom.ls.LSOutput;

public class Uchiha extends Ninja{
    String habilidadeEspecial;

    public String mostrarHabilidadeEspecial(){
        return "A habilidade especial de " + nome + " é " + habilidadeEspecial;
    }

    @Override
    public void mostrarInformacoes(){
        System.out.println("O nome do ninja é " + nome + " sua idade é " + idade + " anos , e ele possui a habilidade especial " + habilidadeEspecial);
        System.out.println("O status da missao é " + missao + " o nivel da missao é " + nivelDeDificuldade + " e o status dela é " + statusDaMissao );
    }
}
