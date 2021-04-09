
import java.util.Scanner;


public class obeb {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.println("1. sayıyı yazınız ");
      int sayi1 = scanner.nextInt();
        System.out.println("2.sayıyı yazınız");
        int sayi2 = scanner.nextInt();
        System.out.println("Obebi : "+ obeb(sayi1,sayi2));
     
    }
    public static int obeb(int n1,int n2) {
        int bolen = 2;
        int obebi = 1;
        
        
        while(bolen <= n1 && bolen<= n2){
          if(n1%bolen== 0 && n2%bolen==0){
              obebi = bolen;
          }  
          bolen++;
          
        }
         return obebi;
    }
 




    
}
