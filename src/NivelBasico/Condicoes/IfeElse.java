package NivelBasico.Condicoes;
public class IfeElse {
    public static void main(String[] args) {
        //if (condicao) {Resultado};
        String nome = "Naruto Uzumaki";
        int idade = 16;
        boolean hokage = false;
        String cargoAtual = "Gennin";
        short quantidadeDeMissoes = 100;
        if(quantidadeDeMissoes > 15 && quantidadeDeMissoes < 30){
            cargoAtual = "Chunnin ! ";
        }else if(quantidadeDeMissoes > 30 && quantidadeDeMissoes < 100){
            cargoAtual = "Jounin ! ";
        }else if(quantidadeDeMissoes >= 100){
            cargoAtual = "Hokage ! ";
        }else{
            System.out.println("Voce ainda nao cumpre os requisitos para subir de rank , seu rank é :" + cargoAtual);
        }
        System.out.println("Seu cargo atual é : " + cargoAtual);
    }
}
