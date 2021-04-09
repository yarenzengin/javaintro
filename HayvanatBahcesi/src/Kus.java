
public class Kus extends Hayvan {

    private String cins;
    private String rengi;
    private int kilo;

    public Kus(String cins, String rengi, int kilo, String ad, String tur, int ayakSayisi) {
        super(ad, tur, ayakSayisi);
        this.cins = cins;
        this.rengi = rengi;
        this.kilo = kilo;
    }

    public String getCins() {
        return cins;
    }

    public void setCins(String cins) {
        this.cins = cins;
    }

    public String getRengi() {
        return rengi;
    }

    public void setRengi(String rengi) {
        this.rengi = rengi;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

}


