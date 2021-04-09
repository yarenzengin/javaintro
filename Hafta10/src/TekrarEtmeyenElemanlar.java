
import java.util.ArrayList;
import java.util.Scanner;

public class TekrarEtmeyenElemanlar {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Sayilari giriniz (Cıkmak için 0'a basınız): ");
        ArrayList<Integer> liste=new ArrayList<>();
        
        while(true){
            Integer sayi=klavye.nextInt();
            if(sayi==0){
                break;
            }
            if(!liste.contains(sayi)){//eğer bu sayı içinde değilse bunu ekle 
                liste.add(sayi);
            }
            
        }
        for(Integer sayi:liste){//(?)
            System.out.print(sayi+" ");
        }
        
        
    }
}