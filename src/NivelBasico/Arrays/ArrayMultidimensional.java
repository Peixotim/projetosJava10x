package NivelBasico.Arrays;
import java.util.Scanner;
public class ArrayMultidimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] ninjasEAldeias = new String[3][3];

        // Um Array Multidimensional é como se fosse uma matriz no caso aqui estamos trabalhando com uma matriz
        // 3 x 3
        ninjasEAldeias [0][0] = "Konoha";  //Primeira linha da primeira coluna (na horizontal)
        ninjasEAldeias [0][1] = "Naruto"; //Segunda linha da primeira coluna (na horizontal)
        ninjasEAldeias [0][2] = "Sasuke"; //Terceira linha da primeira coluna (na horizontal)

        ninjasEAldeias [1][0] = "Nevoa";  //Primeira linha da segunda coluna (na horizontal) - o 1 representa o index
        ninjasEAldeias [1][1] = "Zabuza"; //Segunda linha da segunda coluna (na horizontal)
        ninjasEAldeias [1][2] = "Haku"; //Terceira linha da segunda coluna (na horizontal)

        ninjasEAldeias [2][0] = "Areia";  //Primeira linha da terceira coluna (na horizontal)
        ninjasEAldeias [2][1] = "Gaara"; //Segunda linha da terceira coluna (na horizontal)
        ninjasEAldeias [2][2] = "Sasori"; //Terceira linha da terceira coluna (na horizontal)

        for (int i = 0; i < ninjasEAldeias.length; i++) {
            System.out.println("Aldeia: " + ninjasEAldeias[i][0] + " Ninjas : " + ninjasEAldeias[i][1] +  " " + ninjasEAldeias[i][2] + " ");
        }
    }
}
