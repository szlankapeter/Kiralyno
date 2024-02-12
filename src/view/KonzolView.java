package view;

import model.Tabla;

public class KonzolView {

    private Tabla t;
    private String szoveg;
    
    public KonzolView(Tabla t) {
        this.t = t;
        szoveg = t.Megjelenit();
    }
    
    public void Kiir(){
        System.out.println(szoveg);
    }    
    
}
