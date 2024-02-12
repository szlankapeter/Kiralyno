package model;

import java.util.Random;

public class Tabla {

    Random rnd = new Random();
    private char[][] T;
    private final char UresCella;

    public Tabla(char UresCella) {
        this.T = new char[8][8];
        this.UresCella = UresCella;
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                T[i][j] = this.UresCella;
            }
        }
    }

    public String Megjelenit() {
        String szoveg = "";
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                szoveg += T[i][j] + " ";
            }
            szoveg += "\n";
        }
        return szoveg;
    }

    public void Elhelyez(int N) {
        for (int i = 0; i < N; i++) {
            int randX;
            int randY;
            do {
                randX = rnd.nextInt(8);
                randY = rnd.nextInt(8);
            } while (this.T[randX][randY] != UresCella);

            this.T[randX][randY] = 'K';
        }
    }

    public Boolean UresOszlop(int d) {
        int i = 0;
        while (i <= 7 && T[i][d] == UresCella) {
            i++;
        }
        return !(i <= 7);
    }
    
    public Boolean UresSor(int d) {
        int i = 0;
        while (i <= 7 && T[d][i] == UresCella) {
            i++;
        }
        return !(i <= 7);
    }
    
    public int UresOszlopok(){
        int db = 0;
        for (int i = 0; i <= 7; i++) {
            if(UresOszlop(i)){
                db++;
            }
        }
        return db;
    }
    
    
    public int UresSorok(){
        int db = 0;
        for (int i = 0; i <= 7; i++) {
            if(UresSor(i)){
                db++;
            }
        }
        return db;
    }
}
