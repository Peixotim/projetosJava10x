package NivelBasico.Arrays;
import java.util.Scanner;
public class estudoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidadeDeNomes = 1;
        int stopOrContinue;
        do {
            System.out.print("Digite um nome de ninja : ");
            String[] nomeNinjas = new String[quantidadeDeNomes];
            nomeNinjas[quantidadeDeNomes] = sc.nextLine();
            quantidadeDeNomes++;
            System.out.print("Digite 0 caso queira parar : ");
            stopOrContinue = sc.nextInt();
        } while (stopOrContinue > 0);
    }
}
