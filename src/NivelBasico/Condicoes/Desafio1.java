package NivelBasico.Condicoes;

public class Desafio1 {
    public static void main(String[] args) {

        String ninjaKonohagakure1 = "Itachi Uchiha"; // Ninja 1 -> Itachi Uchiha Renegado
        String missaoNinja1 = "Matar o cla uchiha";
        int idadeNinja1 = 13;
        String rankDaMissao1 = "Rank S";
        boolean ninja1Prodigio = true;
        boolean mangekyouDespertadoNinja1 = true;
        boolean missaoNinja1Concluida = false;

        String ninjaKonohagakure2 = "Shisui Uchiha"; // Ninja 2 -> Shisui Uchiha Rank Anbu
        String missaoNinja2 = "Lutar contra danzou e dar seu olho a Itachi";
        String rankDaMissao2 = "Rank SS";
        int idadeNinja2 = 16;
        boolean ninja2Prodigio = true;
        boolean mangkeyouDespertadoNinja2 = true;
        boolean missaoNinja2Concluida = false;

        String ninjaKonohagakure3 = "Sasuke Uchiha"; // Ninja 3 -> Sasuke Uchiha Renegado
        String missaoNinja3 = "Vingar seu cla matando seu irmao";
        String rankDaMissao3 = "SSS";
        int idadeNinja3 = 16;
        boolean ninja3Prodigio = false;
        boolean mangkeyouDespertadoNinja3 = false;
        boolean missaoNinja3Concluida = false;

               System.out.println("------------------");

                if ((idadeNinja1 >= 16 || ninja1Prodigio) && mangekyouDespertadoNinja1 == true) {
                    missaoNinja1Concluida = true;
                }else if(idadeNinja1 < 16 && ninja1Prodigio == false){
                    System.out.println("Voce ainda nao esta pronto");
                }else if(mangekyouDespertadoNinja1 == false){
                    System.out.println("Voce ainda nao despertou o poderoso Mangekyou");
                }else{
                    System.out.println("Volte quando estiver mais velho e mais forte");
                };
                System.out.println("Nome do Ninja : " + ninjaKonohagakure1);
                System.out.println("Missao do Ninja : " + missaoNinja1);
                System.out.println("Idade do Ninja : " + idadeNinja1);
                System.out.println("Status da Missao : " + missaoNinja1Concluida);
                System.out.println("---------------------------------------------");

        if ((idadeNinja2 >= 16 || ninja2Prodigio) && mangkeyouDespertadoNinja2 == true) {
                    missaoNinja2Concluida = true;
                }else if(idadeNinja2 < 16 && ninja2Prodigio == false){
                    System.out.println("Voce ainda nao esta pronto");
                }else if(mangkeyouDespertadoNinja2 == false){
                    System.out.println("Voce ainda nao despertou o poderoso Mangekyou");
                }else{
                    System.out.println("Volte quando estiver mais velho e mais forte");
                }

                System.out.println("Nome do Ninja : " + ninjaKonohagakure2);
                System.out.println("Missao do Ninja : " + missaoNinja2);
                System.out.println("Idade do Ninja : " + idadeNinja2);
                System.out.println("Status da Missao : " + missaoNinja2Concluida);
        System.out.println("---------------------------------------------");
                ;
                if ((idadeNinja3 == 16 || ninja3Prodigio) && mangkeyouDespertadoNinja3 == false) {
                    missaoNinja3Concluida = true;
                }else if(idadeNinja3 < 16 && ninja3Prodigio == false){
                    System.out.println("Voce ainda nao esta pronto");
                }else if(mangkeyouDespertadoNinja3 == true){
                    System.out.println("Impossivel !");
                }else{
                    System.out.println("Voce ainda nao possui a forca para conseguir concluir a missao");
                }
                System.out.println("Nome do Ninja : " + ninjaKonohagakure3);
                System.out.println("Missao do Ninja : " + missaoNinja3);
                System.out.println("Idade do Ninja : " + idadeNinja3);
                System.out.println("Status da Missao : " + missaoNinja3Concluida);


    }
}
