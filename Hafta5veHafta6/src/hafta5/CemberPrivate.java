/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta5;

/**
 *
 * @author Yaren
 */
public class CemberPrivate {
  private double yaricap=1;
    private static int nesneSayisi=0;

    public CemberPrivate() {
        yaricap=5;
        nesneSayisi ++;
    }
    public CemberPrivate(double y) {
        yaricap=y;
        nesneSayisi ++;
    }
    
    public double alanHesapla(){
        return yaricap*yaricap*Math.PI;
    }
    
    public double cevreHesapla(){
        return 2*yaricap*Math.PI;
        }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }

    public static int getNesneSayisi() {
        return nesneSayisi;
    }

    public static void setNesneSayisi(int YeninesneSayisi) {
        CemberPrivate.nesneSayisi = YeninesneSayisi;
    }
    
    
    
}  

