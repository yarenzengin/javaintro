
public class degiskenveDizi {
      public static void main(String[] args) {
        int x=1;
        int[] y= new int[5];  //bos liste elemanları 0 dır
        
        System.out.println("Metot dan önce ");
        System.out.println("X in degeri: "+ x);
        System.out.println("Y nin ilk elemanı: "+ y[0]);
        metot(x, y);
        System.out.println("Metot dan sonra ");
        System.out.println("X in degeri: "+ x);
        System.out.println("Y nin ilk elemanı: "+ y[0]);
    }
    
    public static void metot(int sayi,int[] sayilar){
        sayi=5;
        sayilar[0]=555;
        System.out.println("Metot un içinde ");
        System.out.println("X in degeri: "+ sayi);
        System.out.println("Y nin ilk elemanı: "+ sayilar[0]);
    }
}
