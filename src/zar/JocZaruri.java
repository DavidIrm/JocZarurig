package zar;

import java.util.Random;

public class JocZaruri {
    private int valoareZar;
    private static int numarTotalAruncari = 0;
    private int sumaJucator;
    public JocZaruri(int sumaJucator){
        this.sumaJucator = sumaJucator;
    }
    public void aruncareZar(){
        Random rand = new Random();
        this.valoareZar = 1 + rand.nextInt(2);
        numarTotalAruncari++;
    }
    static int comparareZaruri(JocZaruri zar1, JocZaruri zar2){
        if (zar1.valoareZar == zar2.valoareZar){
            return 0;
        }
        else if (zar1.valoareZar < zar2.valoareZar){
            return 1;
        }
        else {
            return -1;
        }
    }
    public void adaugaCastig(int miza){
        this.sumaJucator += miza; // acelasi lucru cu: "this.sumaJucator = this.sumaJucator + miza;"
    }
    public void scadePierdere(int miza){
        this.sumaJucator -= miza; // acelasi lucru cu: "this.sumaJucator = this.sumaJucator - miza;"
    }
    public int getSumaJucator(){
        return this.sumaJucator;
    }
    public static int getNumarTotalAruncari(){
        return numarTotalAruncari;
    }
    public int getValoareZar(){
        return this.valoareZar;
    }
}
