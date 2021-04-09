/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta5;

public class StatikCember {
    double yaricap=1;
    static int nesneSayisi=0;//her çağırdığımda nesne oluşturucak? 
    
    public StatikCember() {
        yaricap=5;
        nesneSayisi ++;
    }
    public StatikCember(double y) {
        yaricap=y;
        nesneSayisi ++;
    }
    double alanHesapla(){
        return yaricap*yaricap*Math.PI;
    }
    double cevreHesapla(){
        return 2*yaricap*Math.PI;
    }
    void yaricapGuncelle(double y){
        yaricap=y;
    }

    public static int getNesneSayisi() {//insert code> getter
        return nesneSayisi;
    }
    
    
    
}