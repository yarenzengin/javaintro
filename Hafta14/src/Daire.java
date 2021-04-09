
public class Daire extends Sekil{
private int yaricap;

    public Daire(int yaricap, String isim) {
        super(isim);
        this.yaricap = yaricap;
    }

    @Override
    void alanHesapla() {
        System.out.println(getIsim() + "Alanı " + (Math.PI*yaricap*yaricap) + "dır.");
    }
    
}
