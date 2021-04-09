
import java.util.Scanner;


public class DoWhileDongusu {
    public static void main(String[] args) {
        /*int i = 0;
        do{
            System.out.println("i = " +i );
            i++;
        }while(i < 5);
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı girin : ");
        int sayi = scanner.nextInt();
        int toplam = 0;
        do{
           toplam += sayi %10;
           sayi /= 10;//sayı güncellendi
            System.out.println("Sayı : " + sayi);
        }while(sayi > 0);
        System.out.println("Rakamları Toplamı :  " + toplam);
        
    }
 
    }

