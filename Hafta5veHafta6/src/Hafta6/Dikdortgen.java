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
public class Dikdortgen extends GeometrikNesne{//geometriknesne nin altn sınıfısın demiş olduk
    private double genislik;
    private double yukseklik;

    public Dikdortgen() {
        
    }

    public Dikdortgen(double genislik, double yukseklik, String renk, boolean doluMu) {
        super(renk, doluMu);//extende edilen sınıftaki özelliklere erişim
        this.genislik = genislik;
        this.yukseklik = yukseklik;//2 özelliği yukardan çektik
    }
    public double alanHesapla(){
        return yukseklik* genislik;
        
    }
    public double cevreHesapla(){
        return 2*(genislik+yukseklik);
        
        
    }
    public  void yazdir() {
        System.out.println(super.getOlusturulmaTarihi()+"tarihinde oluşturuldu ve geniişliği : "+getGenislik()+"yüksekliği:"+ getYukseklik());
    }

    public double getGenislik() {
        return genislik;
    }

    public void setGenislik(double genislik) {
        this.genislik = genislik;
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        this.yukseklik = yukseklik;
    }
    
}
