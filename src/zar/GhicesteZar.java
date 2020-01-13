package zar;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
public class GhicesteZar {
    public static void main(String[] args) {
        JocZaruri calculator = new JocZaruri(100);
        int sumaMea = 100;
        int mizaInitiala = 10;
        int miza = 10;
        Scanner tastatura = new Scanner(System.in);
        int valoareZarAruncat;
        Random rand = new Random();

        while (((sumaMea >= miza) && (calculator.getSumaJucator() >= 6*miza)) || (miza != mizaInitiala)){
            System.out.print("Cat crezi ca va fi zarul? :");
            valoareZarAruncat = tastatura.nextInt();
            calculator.aruncareZar();
            System.out.println("Calculatorul a dat: " + calculator.getValoareZar());

            if (valoareZarAruncat == calculator.getValoareZar()) {
                System.out.print("Ai castigat! Vrei sa continui tasteaza DA/ Vrei sa incasezi castigul testeaza altceva:");
                String optiuneJucator = tastatura.next();
                if (optiuneJucator.equalsIgnoreCase("DA")){
                    miza = miza *2;
                    System.out.println("Miza e  acum: " + miza);
                    continue;
                }else {
                    System.out.printf("Aveam %d si am castigat %d\n", sumaMea, 2 * miza - mizaInitiala);
                    sumaMea += 2 * miza - mizaInitiala;
                    calculator.scadePierdere(2 * miza - mizaInitiala);
                    miza = mizaInitiala;
                }
            } else {
                sumaMea -= mizaInitiala;
                calculator.adaugaCastig(mizaInitiala);
                miza = mizaInitiala;
            }
            System.out.printf("Eu am %d lei si calculatorul mai are %d lei\n", sumaMea, calculator.getSumaJucator());
        }
    }
}



