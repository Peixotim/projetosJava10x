package NivelBasico.Arrays;

public class Array {
    public static void main(String[] args) {
        //Array é uma referencia
        int quantidadeDeArrays = 8;
        String[] ninjasRenegados = new String[quantidadeDeArrays];
        String[] ninjas = new String[4]; // Estrutura do Array Tipo[] nomeDaVariavel = new Tipo[quantidadeDeSlots a serem ocupados];
        int[] Idade = new int[3];
        String[] aldeias = new String[4];
        //Para definir a posicao do array e usado um INDEX entao sempre comeca do 0 , ou seja [0,1,2] assim fica a quantidade de numeros
        ninjas[0] = "Naruto Uzumaki"; // Aqui é o numero "1"da lista
        ninjas[1] = "Sasuke Uchiha"; // Aqui é o numero "2"da lista
        ninjas[2] = "Sakura Haruno"; // Aqui é o numero "4"da lista
        ninjas[3] = "Shisui Uchiha";
        System.out.println(ninjas[0]);
        System.out.println(ninjas);
        System.out.println(ninjasRenegados);

        //Um Array e uma lista sao totalmente diferentes
        //Um Array possui uma lista definida com tipos e tudo mais
        //Um Array também é fixo
    }
}
