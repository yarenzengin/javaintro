
public class Arttir {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("x in önceki hali : " +x);
        arttir(x);
        System.out.println("x in sonraki değeri " + x);
    }
    public static void arttir(int n ) {
        n++;
        System.out.println("x in metod içindeki değeri : " + n );
    }
}
 