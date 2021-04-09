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
public class Ogrenci {
     private int ogrenciNo;
     private String adi;
     private Date olusturulmaTarihi;
 
     public Ogrenci(int yeniNo, String yeniAdi) {
      ogrenciNo = yeniNo;
      adi = yeniAdi;
      olusturulmaTarihi = new Date();
  }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public String getAdi() {
        return adi;
    }

    public Date getOlusturulmaTarihi() {
        return olusturulmaTarihi;
    }
     
     
}
