/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yaren
 */
//  ŞABLONUMUZU OLUŞTURDUK
public abstract class Sekil {
    private String isim ;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Sekil(String isim) {
        this.isim = isim;
    }
    public void ismiYazdir(){
        System.out.println("Bu obje " + isim + "objesidir.");
        
}
     abstract void alanHesapla();
     
}
