
import java.util.Scanner;

public class throwOrnegi {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        int yas=klavye.nextInt();
        
        
        try{
        yas_kontrol(yas);    
        }
        
        catch(ArithmeticException e){
            System.out.println("20 yaşından küçükler dışarı çıkamaz!!");
        }
        
    }
    
    public static void yas_kontrol(int yas){
        if(yas < 20){
            throw new ArithmeticException();
        }
        else{
            System.out.println("Dışarı çıkabilirsiniz...");
        }
           
    }
    
}