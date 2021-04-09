/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hafta6;

/**
 *
 * @author Yaren
 */
public class TestGeometrikNesne {
    public static void main(String[] args) {
        Cember c1 = new Cember(5);
        c1.yazdir();
        
        
        Dikdortgen d1 = new Dikdortgen();
        d1.setGenislik(10);
        d1.setYukseklik(15);
        d1.yazdir();
        
        c1.setRenk("mavi");
        System.out.println("Çemberin rengi: "+c1.getRenk());
         System.out.println("Dikdörtgenin rengi: "+d1.getRenk());     
    }
}
