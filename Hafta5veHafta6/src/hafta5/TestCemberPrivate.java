/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta5;

public class TestCemberPrivate {
    public static void main(String[] args) {
        CemberPrivate c1= new CemberPrivate();
        System.out.println("Yaricapı: "+c1.getYaricap()+" Alan: "+c1.alanHesapla());
        c1.setYaricap(c1.getYaricap()*3);
        System.out.println("Yaricapı: "+c1.getYaricap()+" Alan: "+c1.alanHesapla());
        
        System.out.println("Nesne Sayısı: "+CemberPrivate.getNesneSayisi());
    }
}