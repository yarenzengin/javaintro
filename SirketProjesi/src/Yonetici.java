
public class Yonetici extends PersonelSinifi {
   String departman;
   int yElemanSayisi;
   
    public Yonetici(String departman, int yElemanSayisi, String ad, String soyad, String eposta, int dogumYili, int PersonelNumarasi) {
        super(ad, soyad, eposta, dogumYili, PersonelNumarasi);
        this.departman = departman;
        this.yElemanSayisi = yElemanSayisi;
    }
    
    public void yoneticiBilgileriniGoster(){
        System.out.println("bu yönetici " + this.yElemanSayisi+ "çalışanı" +this.departman+ "departmanında yönetmektedir.");
            
}
   
    
    
    
    
    
    
    
    
}
