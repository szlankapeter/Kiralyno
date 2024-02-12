package kiralyno;

import model.Tabla;
import view.KonzolView;

public class Program {

    public static void main(String[] args) {
        Tabla t = new Tabla('.');
        t.Elhelyez(8);
        
        KonzolView kv = new KonzolView(t);
        kv.Kiir();
    }
    
}
