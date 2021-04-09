
import java.util.Scanner;


public class KosulluDurumlar2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Not Giriniz : ");
        int not = scanner.nextInt();
        
        if( not < 50){
            System.out.println("Harf Notunuz : FF");
        }
        else if(not >= 60 ){
            System.out.println("Harf Notunuz : CC");
        } 
        else if(not >= 70 ){
            System.out.println("Harf Notunuz : BB");
        }
        else if(not >= 90) {
         System.out.println("Harf Notunuz : AA");

        }
    }
    
}
