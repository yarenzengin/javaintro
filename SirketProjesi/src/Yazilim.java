
public class Yazilim extends PersonelSinifi {
     String bildigiDiller ;
     String githubLink;
    
    
    public Yazilim(String bildigiDiller, String githubLink, String ad, String soyad, String eposta, int dogumYili, int PersonelNumarasi) {
        super(ad, soyad, eposta, dogumYili, PersonelNumarasi);//verileri personel sınıfına eşitledi
        this.bildigiDiller = bildigiDiller;
        this.githubLink = githubLink;
    }
    public void yazilimProgramlamaDilleriniGoster(){
        System.out.println("bu kişinin bildiği diller" + this.bildigiDiller);
    }
    
}
