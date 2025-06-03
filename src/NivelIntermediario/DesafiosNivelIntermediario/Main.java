package NivelIntermediario.DesafiosNivelIntermediario;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomeNinja;
        String habilidadeEspecialUchiha;
        String missaoDoNinja;
        String nivelDeDificuldadeMissao;
        String statusDaMissao;
        boolean estadoDoSelamento;
        boolean estadoDoByakugan;
        int idade;
        int opcao;
        int chackara;
        do {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja Uchiha"); // Nome , Vila , Idade
            System.out.println("2. Cadastrar Ninja Uzumaki"); // Listar os ninjas utilizando um for
            System.out.println("3. Cadastrar Ninja Hyuuga"); // Aqui a gente vai utilizar um if para listar quais ninjas sao de konoha
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao) {
                case 1:

                    System.out.print("Digite o nome do ninja : ");
                    nomeNinja = sc.nextLine();
                    sc.nextLine();

                    System.out.print("Digite a idade do ninja : ");
                    idade = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Digite a habilidade especial do ninja : ");
                    habilidadeEspecialUchiha = sc.nextLine();
                    sc.nextLine();

                    System.out.print("Digite a missao do ninja : ");
                    missaoDoNinja = sc.nextLine();
                    sc.nextLine(); // so para nao pular para proxima linha direto por conta do sc.nextLine();

                    System.out.print("Digite o nivel de dificuldade da missao : ");
                    nivelDeDificuldadeMissao = sc.nextLine();
                    sc.nextLine(); // limpar o buffing do enter

                    System.out.print("Digite o status da missao : ");
                    statusDaMissao = sc.nextLine();

                    Uchiha novoUchiha = new Uchiha();
                    novoUchiha = new Uchiha();
                    novoUchiha.nome = nomeNinja;
                    novoUchiha.idade = idade;
                    novoUchiha.habilidadeEspecial = habilidadeEspecialUchiha;
                    novoUchiha.missao = missaoDoNinja;
                    novoUchiha.nivelDeDificuldade = nivelDeDificuldadeMissao;
                    novoUchiha.statusDaMissao = statusDaMissao;

                    //Mostrar informacoes
                    novoUchiha.mostrarInformacoes();

                    break;
                case 2:

                    System.out.print("Digite o nome do ninja : ");
                    nomeNinja = sc.nextLine();

                    System.out.print("Digite a idade do ninja : ");
                    idade = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Digite a quantidade de chackara : ");
                    chackara = sc.nextInt();
                    sc.nextLine();

                    System.out.print("O ninja da familia Uzumaki possui a tecnica de selamento no estado : ");
                    estadoDoSelamento = sc.nextBoolean();
                    sc.nextLine(); //limpa o \n deixado ou seja o enter


                    System.out.print("Digite a missao do ninja : ");
                    missaoDoNinja = sc.nextLine();
                     // so para nao pular para proxima linha direto por conta do sc.nextLine();

                    System.out.print("Digite o nivel de dificuldade da missao : ");
                    nivelDeDificuldadeMissao = sc.nextLine();


                    System.out.print("Digite o status da missao : ");
                    statusDaMissao = sc.nextLine();


                    Uzumaki novoUzumaki = new Uzumaki();
                    novoUzumaki.nome = nomeNinja;
                    novoUzumaki.idade = idade;
                    novoUzumaki.chackara = chackara;
                    novoUzumaki.possuiTecnicaDeSelamento = estadoDoSelamento;
                    novoUzumaki.missao = missaoDoNinja;
                    novoUzumaki.nivelDeDificuldade = nivelDeDificuldadeMissao;
                    novoUzumaki.statusDaMissao = statusDaMissao;

                    novoUzumaki.mostrarInformacoes();

                    break;
                case 3:

                    System.out.print("Digite o nome do ninja : ");
                    nomeNinja = sc.nextLine();

                    System.out.print("Digite a idade do ninja : ");
                    idade = sc.nextInt();
                    sc.nextLine();

                    System.out.print("O ninja da familia Hyuuga possui o byakugan no estado : ");
                    estadoDoByakugan = sc.nextBoolean();
                    sc.nextLine(); // limpa a entrada de buff

                    System.out.print("Digite a missao do ninja : ");
                    missaoDoNinja = sc.nextLine();

                    System.out.print("Digite o nivel de dificuldade da missao : ");
                    nivelDeDificuldadeMissao = sc.nextLine();

                    System.out.print("Digite o status da missao : ");
                    statusDaMissao = sc.nextLine();

                    Hyugga novoHyuuga = new Hyugga();
                    novoHyuuga.nome = nomeNinja;
                    novoHyuuga.idade = idade;
                    novoHyuuga.estadoDoByakugan = estadoDoByakugan;
                    novoHyuuga.missao = missaoDoNinja;
                    novoHyuuga.nivelDeDificuldade = nivelDeDificuldadeMissao;
                    novoHyuuga.statusDaMissao = statusDaMissao;

                    novoHyuuga.mostrarInformacoes();

                    break;
                case 4:
                    System.out.println("Saindo do programa !");
                    break;
                default:
                    System.out.println("Digite uma alternativa correta !");
                    break;
            }
        } while (opcao != 4);
    }
}
