
import java.util.Scanner;


public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Kilonuzu Giriniz:");
         int kilo = scanner.nextInt();
         System.out.println("Boyunuzu Giriniz:");  
         double boy = scanner.nextDouble();
         
         
         double bki = kilo/(boy*boy);
         System.out.println("Beden Kitle Endeksiniz : "  +  bki);
          
         
      
         }
    }
 

