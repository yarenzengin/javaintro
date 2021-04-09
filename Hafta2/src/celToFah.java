
import java.util.Scanner;


public class celToFah {
  public static void main(String[] args) {
    
        Scanner klavye = new Scanner(System.in);
        System.out.println("Fah değeri giriniz: ");
        double sayi1=klavye.nextDouble();
        System.out.println(fah2cel(sayi1));
        
        System.out.println("Cel değeri giriniz: ");
        double sayi2=klavye.nextDouble();
        System.out.println(cel2fah(sayi2));
        
    }
    
    public static double fah2cel(double fah){
        return (5.0/9)*(fah-32);
    }
    
    public static double cel2fah(double cel){
        return (9/5.0)*cel+32;
    }  
}
