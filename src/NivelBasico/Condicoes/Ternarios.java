package NivelBasico.Condicoes;
import java.util.Scanner;
public class Ternarios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ternarios sao maneiras para reduzir o codigo
        short numeroDeMissoes = 12;
        boolean academiaFeita = true;

        String resultado = (academiaFeita == true) ? "Musculo crescendo ! " : "Sem musculos para crescer :(";
        String nivel = (numeroDeMissoes >= 10) ? "Esse ninja está com mais de 10 missoes" : "Esse ninja tem menos de 10 missoes";

        System.out.print("Digite a nota de um aluno : ");
        double notaAluno = sc.nextDouble();

        String resultadoAluno = (notaAluno >=7.0) ? "Parabéns voce conseguiu ser aprovado ! " : "Voce foi reprovado faca a recuperacao :( ";
        System.out.println(resultadoAluno);
    }
}
