
public class Kare extends Sekil {
private int kenar;

    public Kare(int kenar, String isim) {
        super(isim);
        this.kenar = kenar;
    }

    @Override
    void alanHesapla() {
        System.out.println(getIsim() + "alanı" + (kenar*kenar) +"dır");
    }
    public void cevreHesapla(){
        System.out.println(getIsim() + " in çevresi" + (4*kenar) + "dır.");
    }
    
}
