
public class Hayvan {
    private String ad;//erişilmesin diye
    private String tur ;
    private int ayakSayisi;

    public Hayvan(String ad, String tur, int ayakSayisi) {
        this.ad = ad;
        this.tur = tur;
        this.ayakSayisi = ayakSayisi;
    }

    public String getAd() {
        return ad;
    }
    //private elemena ulaşamıyoruz verileri burdan alıyoruz
    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public int getAyakSayisi() {
        return ayakSayisi;
    }

    public void setAyakSayisi(int ayakSayisi) {
        this.ayakSayisi = ayakSayisi;
    }
    
    
    
    
}
