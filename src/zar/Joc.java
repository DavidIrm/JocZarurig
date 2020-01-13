package zar;

public class Joc {
    public static void main(String[] args) {
        JocZaruri jucator1 = new JocZaruri(100);
        JocZaruri jucator2 = new JocZaruri(150);
        int miza = 10;
        int i;
        for (i = 1;((jucator1.getSumaJucator() >= miza) && (jucator2.getSumaJucator() >= miza)); i+=1) {
            System.out.println("\n*************");
            System.out.printf("Jocul numarul: %d:\n", i);
            jucator1.aruncareZar();
            System.out.println("jucator1 a dat: " + jucator1.getValoareZar());
            jucator2.aruncareZar();
            System.out.println("jucator2 a dat: " + jucator2.getValoareZar());

            switch (JocZaruri.comparareZaruri(jucator1, jucator2)) {
                case -1:
                    jucator1.adaugaCastig(miza);
                    jucator2.scadePierdere(miza);
                    break;
                case 0:
                    System.out.println("A fost egal!");
                    break;
                case 1:
                    jucator2.adaugaCastig(miza);
                    jucator1.scadePierdere(miza);
                    break;
                default:
                    System.out.println("Ai dat de o eroare grava!");
            }
            System.out.printf("Jucator unu mai are %d lei iar jucator 2 mai are %d lei",
                    jucator1.getSumaJucator(), jucator2.getSumaJucator());
        }
        System.out.println("\nJocul s-a terminat dupa " + JocZaruri.getNumarTotalAruncari()/2 + " runde!");
        System.out.println("\nJocul s-a terminat dupa " + (i-1) + " runde!");
    }
}
