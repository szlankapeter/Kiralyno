package model;

public class Tabla {

    private char[][] T;
    private char UresCella;

    public Tabla(char UresCella) {
        this.UresCella = UresCella;
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                this.T[i][j] = this.UresCella;
            }
        }
    }

}
