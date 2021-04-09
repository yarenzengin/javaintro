/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta5;

public class TestStatikCember {
    public static void main(String[] args) {
        StatikCember c1 = new StatikCember(10);
        System.out.println("Yaricapi : "+ c1.yaricap);
        System.out.println("Nesne Sayisi : " + StatikCember.getNesneSayisi());
        
        c1.yaricapGuncelle(20);
        System.out.println("Yaricapi : "+ c1.yaricap);
        System.out.println("Nesne Sayisi : " + StatikCember.getNesneSayisi());
        
        StatikCember c2 = new StatikCember(15);
        System.out.println("Yaricapi : "+ c2.yaricap);
        System.out.println("Nesne Sayisi : " + StatikCember.getNesneSayisi());
        
        StatikCember.nesneSayisi=100;
        System.out.println("Nesne Sayisi : " + StatikCember.getNesneSayisi());
        
    }
}
