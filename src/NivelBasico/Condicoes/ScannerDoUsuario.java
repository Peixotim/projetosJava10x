package NivelBasico.Condicoes;
import java.util.Scanner;
public class ScannerDoUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome de um ninja : ");
        String nomeDoNinja = sc.nextLine();
        if(nomeDoNinja.equals("Sasuke Uchiha") || nomeDoNinja.equals("Naruto Uzumaki") || nomeDoNinja.equals("Sakura Haruno")){
            System.out.println("Parabéns voce é do renomado TIME 7");
        }else{
            System.out.println(nomeDoNinja);
        }
        System.out.print("Digite a idade do seu ninja : ");
        int idade = sc.nextInt();
        if (idade >= 12) {
            System.out.println("Parabéns voce esta apto a fazer o exame Chunnin !");
        }else{
            System.out.println("Volte quando estiver mais velho ! ");
        }
        //Fechar sempre o Scanner
        sc.close();
    }
}
