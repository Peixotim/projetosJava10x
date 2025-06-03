package NivelBasico.Condicoes;

public class LacosDeRepeticoes {
    public static void main(String[] args) {
         int quantidadeDeChackaraMaximo = 100;
         int i = 0;

         for(i = 0; i <= quantidadeDeChackaraMaximo ; i++){
             System.out.println("Clone Das Sombras ! " + i);
             if(quantidadeDeChackaraMaximo == 0){
                 System.out.println("O seu chackara acabou descanse !");
             }
         }
         int quantidadeDeRasengan = 0;

         while(quantidadeDeRasengan < 100){
             System.out.println("Rasengan");
             quantidadeDeRasengan ++;
             if(quantidadeDeRasengan == 100){
                 System.out.println("Seu Chackara acabou :( ");
             }
         }
    }
}
