
import java.util.Scanner;


public class diziyeElemanEkleme {
      public static void main(String[] args) {
        int[] liste3=new int[3];
        Scanner klavye=new Scanner(System.in);
        System.out.println(liste3.length+" tane eleman giriniz: ");
        
        for (int i = 0; i < liste3.length; i++) {
            liste3[i]=klavye.nextInt();
        }
      System.out.println("***********************");
        for (int i = 0; i < liste3.length; i++) {

            System.out.println(liste3[i]+" ");
                    
        }
    }
}
