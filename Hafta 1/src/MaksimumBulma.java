
public class MaksimumBulma {

    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        int k = max(i, j);
        
        System.out.println(i + " ile" + j + " den buyuk olan " + k + "dır");
    }

    public static int max(int sayi1, int sayi2) {
        int sonuc;
        if (sayi1 > sayi2) {
            sonuc = sayi1;
        } else {
            sonuc = sayi2;
        }
        return sonuc;
    }
}
