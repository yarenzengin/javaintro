
import java.util.Scanner;


public class DongulerleATMProgrami {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        int bakiye = 1000;
        String islemler = "1.İşlem : Bakiye Öğrenme\n"
                         +"2.İşlem Para Çekme\n"
                         +"3.İşlem Para Yatırma\n"
                         +"Çıkış için q 'a basınız";
        System.out.println("*****************************");
        System.out.println(islemler);
        System.out.println("*****************************");

        while(true){
            System.out.println("İşlem Seçiniz");
             String islem = scanner.nextLine();
            if(islem.equals("q")){//eşittir koysaydık karışırdı o yüzden equals kullandık
                System.out.println("Çıkış Yapılıyor...");
                break;
            }else if(islem.equals("1")){
                System.out.println("Bakiyeniz : " + bakiye);
            }else if(islem.equals("2")){
                System.out.println("Çekmek İstediğiniz Tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                
               if(bakiye - tutar < 0  ){
                   System.out.println("YETERSİZ BAKİYE" + bakiye);
                   
               }else{
                   bakiye -= tutar;// bakiye güncellendi
                   System.out.println("Yeni Bakiye : " + bakiye);
               }
               }else if(islem.equals("3")){
                       System.out.println("Yatırmak İstediğiniz Tutar : ");
                       int tutar = scanner.nextInt();
                       scanner.nextLine();
                       
                       bakiye += tutar;
                       System.out.println("Yeni Bakiye : " + bakiye);
                    
                }else{
                   System.out.println("Geçersiz İşlem");
                
                
            }

            
            
            
        }
        
        
    }
    
}
