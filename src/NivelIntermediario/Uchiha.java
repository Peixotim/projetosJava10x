package NivelIntermediario;

public class Uchiha extends Ninja {
    public void sharinganAtivado() {
        if (tempoDeTreino > 10) {
            System.out.println("O Sharingan do " + nome + " esta ativado cuidado !");
        } else {
            System.out.println("Ainda estou treinando para conseguir meu Sharingan !");
        }
    }

    public boolean bolaDeFogo() {
        return true;
    }
    public boolean mangekyouSharingan(){
        return true;
    }
}
