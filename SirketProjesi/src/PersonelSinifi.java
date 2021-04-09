
public class PersonelSinifi {

    String ad;
    String soyad;
    String eposta;
    int dogumYili;
    int PersonelNumarasi;

    public PersonelSinifi(String ad, String soyad, String eposta, int dogumYili, int PersonelNumarasi) {
        this.ad = ad;
        this.soyad = soyad;
        this.eposta = eposta;
        this.dogumYili = dogumYili;
        this.PersonelNumarasi = PersonelNumarasi;
    }

    public void personelYasHesapla() {
        System.out.println(this.ad + " 'ın yaşı " + (2020 - this.dogumYili));

    }

}

}
