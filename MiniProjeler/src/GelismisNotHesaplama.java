
import java.util.Scanner;


public class GelismisNotHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vize 1 : ");
        int v1 = scanner.nextInt();
        System.out.println("Vize 2 : ");
        int v2 = scanner.nextInt();
        System.out.println("Final  : ");
        int f1 = scanner.nextInt();
        
     
        double toplamnot = ((v1 * 3/10.0)  + (v2 * 3/10.0) + (f1 * 4/10.0));
        
        if( toplamnot >= 90){
            System.out.println("AA");
        }else if(toplamnot >= 80){
            System.out.println("BB");
        }else if(toplamnot >= 70){
            System.out.println("CC");
        }else if(toplamnot >= 60){
            System.out.println("DD");
                    }else{
                System.out.println("FF...KALDINIZ");
            }
        }
    }
