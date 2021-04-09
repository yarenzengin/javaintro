
import java.util.Scanner;


public class YakitTutari {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
        System.out.println("Aracınız km'de kaç kuruş yakıyor?");
        double kurus = scanner.nextDouble();
        System.out.println("Aracınızla kaç km gittiniz?");
        int km = scanner.nextInt();
        
        System.out.println("Ödemeniz Gereken Toplam Tutar : " + (kurus*km) + " tl'dir.");
        
        
        
        
    }
}
