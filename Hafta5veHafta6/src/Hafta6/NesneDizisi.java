/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hafta6;

import hafta5.CemberPrivate;

public class NesneDizisi {
    public static void main(String[] args) {
        CemberPrivate[] dizi=new CemberPrivate[10];
                
        System.out.println(dizi[5]);   //null
        
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=new CemberPrivate(i+1);
        }
        System.out.println(dizi[6].getYaricap()); 
        System.out.println(dizi[7].cevreHesapla()); 
        System.out.println(dizi[9].alanHesapla()); 
        System.out.println(dizi[15].getYaricap()); // Hata boyut fazlasÄ±
    }
}

