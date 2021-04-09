
import java.util.Scanner;


public class KosullarlaBedenKitleEndeksiHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kilonuzu Girin : ");
        int kilo = scanner.nextInt();
        System.out.println("Boyunuzu Girin");
        double boy = scanner.nextDouble();
        
        double bki = kilo / (boy*boy);
        
        if( bki < 18.5){
            System.out.println("Zayıf");
        }else if(bki >= 18.5 && bki<25){
            System.out.println("Normal");
        }else if(bki >= 25 && bki < 30){
            System.out.println("Fazla Kilolu");
        }else{
            System.out.println("Obez");
        }
    }
}
