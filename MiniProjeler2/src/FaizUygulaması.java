
import java.util.Scanner;


public class FaizUygulaması {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamıza hoşgeldiniz . Faiz Oranı %6 'dır .");
        int anapara,vade;
        
        
        System.out.println("Yatırmak İstediğiniz Tutar");
        anapara = scanner.nextInt();
        System.out.println("Kaç yıl vade ile yatırmak istiyorsunuz?");
        vade = scanner.nextInt();
        
        double toplampara = anapara;
        double faizOrani = 0.06;
        
        for (int i = 1; i<=vade ; i++){
            toplampara = (toplampara * faizOrani) + toplampara;
            System.out.println(i + ".yılın sonunda toplam para : " + (int)toplampara );
            
        }
        
    }
  
}
