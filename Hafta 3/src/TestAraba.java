
public class TestAraba {
    public static void main(String[] args) {
        
   
    Araba arabam=new Araba();
        arabam.renk="Kirmizi";
        arabam.model="Mercedes";
        arabam.vitesTipi="Otomatik";
        arabam.yakitTipi="Elektrik";
        arabam.kapiSayisi=4;
        arabam.yili=2020;
        arabam.km=10000;
        
        
        System.out.println("Hayalimdeki Araba \nRengi:"+arabam.renk+
                "\nModeli:"+arabam.model+
                "\nVites Tipi:"+arabam.vitesTipi+
                "\nYakıt Tipi:"+arabam.yakitTipi+
                "\nKapı Sayısı:"+arabam.kapiSayisi+
                "\nYili:"+arabam.yili+
                "\nKm:"+arabam.km);
         }
    }

