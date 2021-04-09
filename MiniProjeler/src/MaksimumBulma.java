
import java.util.Scanner;


public class MaksimumBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci Sayı : ");
        int a = scanner.nextInt();
        System.out.println("İkinci Sayı : ");
        int b = scanner.nextInt();
        System.out.println("Üçüncü Sayı : ");
        int c = scanner.nextInt(); 
        
        int maks = -1;// java hata vermesin diye maks sayı belirledik.
        
        if(a >=b && a>= c){
            maks = a;
            
        }else if(b >= a && b>= c){
            maks =b;
        }else{
            maks = c;
        }
        System.out.println("Maksimum Sayı :  "  + maks);
    }
    
    
}
