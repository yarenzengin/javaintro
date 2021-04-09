
public class Cember {
int yaricap;

    public Cember(int yaricap) {
        this.yaricap = yaricap;
        System.out.println("yeni bir çember türetildi");
    }
    public void cemberAlanHesapla(){
       double cemberAlani = Math.PI*(this.yaricap* this.yaricap);
        
        System.out.println("Çemberin Alanı : "+ cemberAlani );
        
    }




    
}
