package NivelIntermediario;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Criar o ninja Naruto - Naruto é um OBJETO
        Uzumaki Naruto =  new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 18;
        Naruto.aldeia = "Konoha";
        Naruto.saldo = 10000;
        Naruto.chackara =  100;
        Naruto.chackaraBuffado();
        Naruto.possuiVento();
        //Podemos trabalhar com os valores passados para true

        //Criar o ninja Sasuke Uchiha - Sasuke é um OBJETO

        Uchiha Sasuke = new Uchiha();
        Sasuke.tempoDeTreino = 12;
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.saldo = 200000;
        Sasuke.aldeia = "Konoha";
        Sasuke.idade = 18;
        Sasuke.chackara = 10120;
        Sasuke.passouPorTraumas = true;
        Sasuke.sharinganAtivado();
        Sasuke.bolaDeFogo(); // = True
        if(Sasuke.passouPorTraumas){
            Sasuke.mangekyouSharingan();
        }else{
            System.out.println("Ainda nao possui mangekyou");
        }

        Hyugga Neiji = new Hyugga();
        Neiji.nome = "Neiji Hyuuga";
        Neiji.idade = 18;
        Neiji.aldeia = "Konoha";
        Neiji.saldo = 10012030;
        Neiji.chackara = 101020;
        Neiji.byakugan();


//
//        double saldoFinal = Sasuke.quantoParaFicarRico(Sasuke.saldo); // Aqui ele subtrai o montante total de dinheiro setado , por 20000
//
//        if(saldoFinal >= 0){
//            System.out.println("Parabéns voce já é rico!");
//        }else{
//            System.out.println("Ganhe mais dinheiro para poder ficar rico");
//        }
//        System.out.println(Sasuke.quantoParaFicarRico(Sasuke.saldo));
//
//        System.out.println("Voce tem " + Sasuke.saldo + " e caso seu saldo seja negativo voce nao é rico  : " + saldoFinal );
    }
}
