package NivelBasico.Desafios;
import java.util.Objects;
import java.util.Scanner;
public class desafioNivelBasico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ninjas = new String[40]; // Garbage Collector vai funcionar aqui excluindo arrays nao utilizaveis
        String[] vilaDoNinja = new String[40];
        int[] idadeNinja = new int[40];
        int opcao;
        int numeroNinja = 0;
        int i = 0;
        do {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja"); // Nome , Vila , Idade
            System.out.println("2. Listar Ninjas"); // Listar os ninjas utilizando um for
            System.out.println("3. Listar Ninjas de Konoha"); // Aqui a gente vai utilizar um if para listar quais ninjas sao de konoha
            System.out.println("4. Listar Ninjas mais Velhos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1:

                    System.out.print("Digite o nome do Ninja : ");
                    ninjas[numeroNinja] = sc.nextLine();

                    System.out.print("Digite a vila do Ninja : ");
                    vilaDoNinja[numeroNinja] = sc.nextLine();

                    System.out.print("Digite a idade do Ninja : ");
                    idadeNinja[numeroNinja] = sc.nextInt();

                    numeroNinja++;
                    break;
                case 2:
                    if (numeroNinja < 1 ) {
                       //numeroNinja sempre que passar dentro de cadastro vai ser maior que = 1
                        System.out.println("Nao há ninjas cadastrados !");
                    }else{
                        for (i = 0; i < numeroNinja; i++) {
                            int numeroDoNinja = i + 1;

                            System.out.println("Ninja : " +  numeroDoNinja);
                            System.out.println("Nome : " + ninjas[i] );
                            System.out.println("Vila : " + vilaDoNinja[i]);
                            System.out.println("Idade : " + idadeNinja[i]); // i representa o numero equivalente ao index do ninja ou seja posicao do ninja cadastrado
                            System.out.println("==========================");
                        }
                    }
                    break; // Quando se esquece o break o switch executa o proximo case sem precisar! (Atencao)
                case 3:
                    if (numeroNinja < 1) {
                        System.out.println("Nao há nenhum ninja cadastrado !");
                    }else{
                        for (int j = 0; j < numeroNinja; j++) {
                            if (vilaDoNinja[j].equalsIgnoreCase("Konoha")) {
                                System.out.println("Ninja : " + ninjas[j]);
                            }
                        }
                    }
                    break;
                case 4:
                    if(numeroNinja < 1) {
                        System.out.println("Nao há nenhum ninja cadastrado !");
                    }else{
                        for (int k = 0; k < numeroNinja; k++) {
                            if(idadeNinja[k] >= 30){
                                System.out.println("Ninja : " + ninjas[k]);
                            }
                        }
                    }
                    //Listar Ninjas mais velhos!
                    break;
                case 5:
                    System.out.println("Saindo do programa !");
                    break;
                default:
                    System.out.print("Digite um número correto !");
                    break;
            }
        }while(opcao != 5);
        //Usar switch case para usar o menu iterativo

        //Para listar vamos listar usando um for puxando todos os ninjas
    }
}
