
import java.util.Scanner;


public class BasitHesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("**************************");
        String islemler = "1. Toplama İşlemi\n"
                         + "2. Çıkarma İşlemi\n "
                        + "3. Çarpma İşlemi\n "
                        + "4.Bölme İşlemi ";
        System.out.println(islemler);
        System.out.println("**************************");
        
        System.out.println("İşlem Seçiniz : ");
       String islem = scanner.nextLine();
       int a;
       int b;
       
       switch(islem){
           case "1":
               System.out.println("Birinci Sayı : ");
               a = scanner.nextInt();
               System.out.println("İkinci Sayı : ");
               b = scanner.nextInt();
               System.out.println("Değerlerin Toplamı : " + (a + b));
             break;
             case "2":
               System.out.println("Birinci Sayı : ");
               a = scanner.nextInt();
               System.out.println("İkinci Sayı : ");
               b = scanner.nextInt();
               System.out.println("Değerlerin Farkı : " + (a - b));
             break;
              case "3":
               System.out.println("Birinci Sayı : ");
               a = scanner.nextInt();
               System.out.println("İkinci Sayı : ");
               b = scanner.nextInt();
               System.out.println("Değerlerin Çarpımı  : " + (a * b));
             break;
             case "4":
               System.out.println("Birinci Sayı : ");
               a = scanner.nextInt();
               System.out.println("İkinci Sayı : ");
               b = scanner.nextInt();
               System.out.println("Değerlerin Bölümü " + ((double)a /b));
              //bölme küsüratlı olduğu için int a yı double yaptık.
                
             break;
             default:
                 System.out.println("Geçersiz İşlem");
       }

    }
    
}
