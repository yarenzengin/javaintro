public class DinamikBaglama {
    public static void main(String[] args) {
        m(new MezunOgrenci());
        m(new Ogrenci());
        m(new Kisi());
        m(new Object());
    }
    public static void m(Object x){
        System.out.println(x.toString());
    }}
 
class Kisi extends Object{
    @Override
    public String toString(){
       return "Kisi"; 
    }
}
class Ogrenci extends Kisi{
    @Override
    public String toString(){
      return "Ogrenci";  
    }
}
class MezunOgrenci extends Ogrenci{
}