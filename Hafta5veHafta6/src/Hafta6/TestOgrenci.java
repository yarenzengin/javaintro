/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hafta6;

import java.util.Date;

/**
 *
 * @author Yaren
 */
public class TestOgrenci {
    public static void main(String[] args) {
        Ogrenci ogr1 = new Ogrenci(1111,"Ahmet");
          
        Date yeniTarih = ogr1.getOlusturulmaTarihi();
        yeniTarih.setTime(999999999);
        
           
        System.out.println("No : " +ogr1.getOgrenciNo()+ 
                           "\nAdı : "+ ogr1.getAdi()+
                           "\nKayıt Tarihi : "+ogr1.getOlusturulmaTarihi());
    
    
    
    
    }
}
