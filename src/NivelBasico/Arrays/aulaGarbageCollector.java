package NivelBasico.Arrays;

public class aulaGarbageCollector {
    public static void main(String[] args) {

        String[] nomesNinja = new String[8];
        nomesNinja[0] = "Naruto";
        nomesNinja[1] = "Sasuke Uchiha";
        nomesNinja[2] = "Sakura Haruno";
        // Aqui ocorre o Garbage Collector
        nomesNinja[0] =  "Hashirama Senju";
        nomesNinja[1] = "Tobirama Senju";
        nomesNinja[2] = "Hiruzen Sarutobi";
        nomesNinja[3] = "Minato Namikaze";
        nomesNinja[4] = "Tsunade Senju";
        nomesNinja[5] = "Kakashi Hatake";
        nomesNinja[6] = "Naruto Uzumaki";
        System.gc();
        int numeroNinja = 0;
        for (int i = 0; i < 7 ; i++) {
            System.out.println(nomesNinja[numeroNinja]);
            //Ou System.out.println(nomesNinja[i]);
            numeroNinja++;
        }
    }
}
