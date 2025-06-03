package NivelIntermediario;

import org.w3c.dom.ls.LSOutput;

public class Ninja {
    String nome;
    String aldeia;
    String nomeFamilia;
    boolean possuiSharingan;
    double saldo;
    int idade;
    int tempoDeTreino;
    boolean passouPorTraumas;
    int chackara;



    /* Criar um metodo Publico personalizado
    * Um metodo void nao precisa retornar nada
    *
    */



    // Metodo tem que retornar uma String

    public String boasVindas(){
        return "Olá Seja bem vindo ! " + nome;
    }

    public double quantoParaFicarRico(double saldo){
        return saldo-20000;
    }

}

