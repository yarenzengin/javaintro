/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta7;

/**
 *
 * @author Yaren
 */
public class Elma extends Meyve{

    public Elma() {
        
    }

    public Elma(String isim) {
        super(isim);
    }
    
}

class Meyve{

    public Meyve() {
    }
    
    public Meyve(String isim){
        System.out.println("Meyve cons. çağırıldı.");
    }
}

