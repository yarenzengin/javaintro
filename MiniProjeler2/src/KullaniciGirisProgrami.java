
import java.util.Scanner;


public class KullaniciGirisProgrami {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int giris_hakki = 3 ;
        
        String sys_kullanici_adi = "Yaren Zengin";
        String sys_parola = "1234";
        
        System.out.println("******************");
        System.out.println("Kullanıcı Girişine Hoşgeldiniz.");
        System.out.println("******************");
        
        while(true){
            System.out.println("Kullanıcı Adı : ");
            String kullanici = scanner.nextLine();
            System.out.println("Parola : ");
            String parola = scanner.nextLine();
            
            if(kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)){
                System.out.println("Hoşgeldiniz " + kullanici);
                break;
            }else if(kullanici.equals(sys_kullanici_adi) && !parola.equals(sys_parola)){
                System.out.println("Parolanız Yanlış.");
                
                giris_hakki -= 1;
                System.out.println("Kalan Giriş Hakkınız : " + giris_hakki);
            }else if(!kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)){
                System.out.println("Kullanıcı Adı Yanlış.");
                
                giris_hakki -= 1;
                System.out.println("Kalan Giriş Hakkınız : " + giris_hakki);
             
        }  else{
                System.out.println("Kullanıcı Adı ve Parola Yanlış.");
                giris_hakki -= 1;
            }              
        if(giris_hakki == 0){
            System.out.println("Giriş Hakkınız Bitti.Tekrar Bekleriz");
           
        }
                
        } 
    }
    
}
