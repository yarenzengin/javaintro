
public class TarihSinifi {
    public static void main(String[] args) {
        java.util.Date tarih1= new java.util.Date();
        System.out.println(tarih1.toString());
        System.out.println(tarih1.getTime());
        
        java.sql.Date tarih2= new java.sql.Date(0);
        System.out.println(tarih2.toString());
    }
}
