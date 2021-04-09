/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yaren
 */
public class Main {
    public static void main(String[] args) {
        Kare kare1 = new Kare(5, "Kare1");
        Daire daire1 = new Daire(4,"Daire1");
        
        
        kare1.alanHesapla();
        kare1.cevreHesapla();
        daire1.alanHesapla();
        
        Sekil kare2 = new Kare(6,"Kare2");
        kare2.alanHesapla();
        ((Kare)kare2).cevreHesapla();
    }
    
}
