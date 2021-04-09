
public class At extends Hayvan{
    private String cins;
    private String geldigiYore;

    public At(String cins, String geldigiYore, String ad, String tur, int ayakSayisi) {
        super(ad, tur, ayakSayisi);
        this.cins = cins;
        this.geldigiYore = geldigiYore;
    }

    public String getCins() {
        return cins;
    }

    public void setCins(String cins) {
        this.cins = cins;
    }

    public String getGeldigiYore() {
        return geldigiYore;
    }

    public void setGeldigiYore(String geldigiYore) {
        this.geldigiYore = geldigiYore;
    }
    
            
}
