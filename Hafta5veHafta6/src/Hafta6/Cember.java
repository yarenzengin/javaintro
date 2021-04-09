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
public class Cember extends GeometrikNesne{
    private double yaricap;

    public Cember() {
        super();
    }
    
   public Cember(double yaricap) {
        this.yaricap = yaricap;
}

    public Cember(double yaricap, String renk, boolean doluMu) {
        super(renk, doluMu);
        this.yaricap = yaricap;
    }
   public double alanHesapla(){
       return Math.PI*yaricap*yaricap;
               
   }
   public double cevreHesapla(){
       return 2*Math.PI*getYaricap();
              
   }
    public double getYaricap() {
        return yaricap;
    }
     public double capHesapla() {
        return 2*getYaricap();
}
     public  void yazdir() {
        System.out.println(super.getOlusturulmaTarihi()+"tarihinde oluşturuldu ve yarıçapı : "+getYaricap());
    }
    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }
   
   
   
   
   
   
   
   
   
   
   
   
   
}

