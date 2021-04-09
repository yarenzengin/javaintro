public class TestHayvan2 {
    public static void main(String[] args) {
       konustur(new Kedi("Duman")); 
       konustur(new Kopek("Gülbatur"));
       konustur(new At("Şahbatur"));
    }
    
    public static void konustur(Hayvan hayvan){//2 li işlemleri kısaltmaya yardımcı olur. 
        System.out.println(hayvan.konus());
    }
            
            
            
            
            
            
}