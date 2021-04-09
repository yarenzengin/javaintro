
public class elemanlarToplami {
     public static void main(String[] args) {
        double[] liste5=new double[5];
        double toplam=0;
        for (int i = 0; i < liste5.length; i++) {
            liste5[i]=Math.random()*10;
            System.out.println(liste5[i]); 
            toplam +=liste5[i];
        }
        System.out.println(toplam);
        
        
        
    }
}
