
import java.util.Scanner;


public class GirilenSayininArmstrogSayisiOldugunuBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı Girin : ");
        int sayi = scanner.nextInt();
        System.out.println("Basamak Sayısını Girin : ");
        int basamak_sayisi = scanner.nextInt();
        
        int gecici_sayi = sayi;
        int toplam = 0;
        
        do{
            int basamak_degeri = gecici_sayi%10;
            gecici_sayi /= 10;
            
            toplam += Math.pow(basamak_degeri, basamak_sayisi);
            
            
        }while(gecici_sayi > 0);
        if( sayi == toplam){
            System.out.println("Bu bir armstrong sayısıdır");
        }else{
           System.out.println("Bu bir armstron456g sayısı değildir");

        }
    }
}
