package NivelBasico.Condicoes;
import java.util.Scanner;
public class EstudoSwitchCases {
    public static void main(String[] args) {
        //Abrir a caixa
        Scanner sc = new Scanner(System.in);
        System.out.println("Escola um úsuario : ");
        System.out.println("1 - Naruto Uzumaki ");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");
        System.out.println("4 - Itachi Uchiha");
        System.out.println("5 - Shisui Uchiha");
        int numeroDoPersonagem = sc.nextInt();
        switch (numeroDoPersonagem) { //A variavel que vai dentro do paratenses é equivalente ao motivador da minha acao entao oque o
            case 1 :
                System.out.println("Parabéns o seu personagem possui a KURAMA");
                break;
            case 2:
                System.out.println("Parabéns o seu personagem possui um Rinnegan e um Mangekyou Eterno");
                break;
            case 3:
                System.out.println("Parabéns a sua personagem é  muito forte");
                break;
            case 4:
                System.out.println("Parabéns o seu personagem é da AKATSUKI");
                break;
            case 5:
                System.out.println("Parabéns seu usuario foi um ANBU de ELITE");
                break;
            default:
                System.out.println("Voce nao digitou uma resposta valida tente novamente !");
                break;
        }
        //Fechar a caixa
        sc.close();
    }
}
