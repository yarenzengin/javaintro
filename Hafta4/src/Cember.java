
public class Cember {
       
    double yariCap=1;//yarıçapı tanımladık
    //parametresiz
    Cember(){
       yariCap=5;  
     }
    
    //parametreli
    Cember(double y){
        yariCap=y;
    }
    
    
    
    double alanHesapla(){
        return yariCap*yariCap*Math.PI;
    }
    
    double cevreHesapla(){
        return 2*yariCap*Math.PI;
    }
    
    void yariCapGuncelle(double y){
        yariCap = y; 
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

