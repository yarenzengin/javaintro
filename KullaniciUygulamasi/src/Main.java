
public class Main {
    public static void main(String[] args) {
     //kaydolduk
    Kullanici yaren = new Kullanici("yaren@gmail.com",8976,"yaren zengin ", "yarennn", 1999,"kadın","şifre");
          /*//bilgileri göster
    yaren.kisaBilgiGoster();
        //oturumu kapat 
        yaren.oturumuKapat();
        
        
        yaren.kisaBilgiGoster();
        
        yaren.oturumAc("yarennn","şifre");
        //bilgileri tekrar göster
        yaren.kisaBilgiGoster();
        
        
        
      yaren.kullaniciAdiDegistir("yaren");
      yaren.kisaBilgiGoster();
      yaren.satisYap();*/
        yaren.oturumuKapat();
        yaren.oturumAc("yarennn", "şifre");
        yaren.satisYap();
    }
          
}
