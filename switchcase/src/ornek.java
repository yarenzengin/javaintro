
import java.util.Scanner;


public class ornek {
    public static void main(String[] args) {
        /*
        switch(op){
        case durum1 : 
        islemler
        break
        case durum2:
        islemler
        break
        //
        //
        default:
        islemler
        break
        } */
        
        Scanner scanner =new Scanner(System.in);
        
        System.out.println("İşlem Giriniz : ");
        int islem = scanner.nextInt();
        
        switch(islem){
            case 1 :
                System.out.println("1. İşlem");
                break;
                
            case 2 : 
          System.out.println("2. İşlem");
              break;
            case 3: 
                System.out.println("3.İşlem");
                break;
                
            default:
                System.out.println("Geçersiz İşlem");
       }
               
        
        
        
        
        
    }
    
}
