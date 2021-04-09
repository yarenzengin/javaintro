
import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> sehirListesi=new ArrayList<>();
        sehirListesi.add("Bandirma");
        sehirListesi.add("İstanbul");
        sehirListesi.add("Ankara");
        sehirListesi.add("Antalya");
        sehirListesi.add("Yozgat");
        sehirListesi.add("Sivas");
        
        System.out.println("Liste Boyutu: "+sehirListesi.size());
        System.out.println("Sehir Listesinde Yozgat var mı? :"+sehirListesi.contains("Yozgat"));
        System.out.println("Sivas sehrinin indexi: "+sehirListesi.indexOf("Sivas"));
        System.out.println("Sehir Listesi boş mu?: "+sehirListesi.isEmpty());
        System.out.println(sehirListesi.toString());
        sehirListesi.add(3, "Bursa");
        System.out.println(sehirListesi.toString());
        sehirListesi.remove("Bandirma");
        sehirListesi.remove(4);
        System.out.println(sehirListesi.toString());
        
        for (int i = sehirListesi.size()-1; i >=0; i--) {
            System.out.println(sehirListesi.get(i));//sondan başa doğru yazdırmak için 
           
            
        }
        
        
        
        
        
        
        
        
        
        
    }
}