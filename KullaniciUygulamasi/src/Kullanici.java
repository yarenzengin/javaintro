
import java.util.Calendar;


public class Kullanici {
    String ePosta;
    int telNo;
    String adveSoyad;
    String kullaniciAdi;
    int dogumYili;
    String cinsiyet;
    String sifre;
    boolean girisYaptiMi = false;

    public Kullanici(String ePosta, int telNo, String adveSoyad, String kullaniciAdi, int dogumYili, String cinsiyet,String sifre) {
        this.ePosta = ePosta;
        this.telNo = telNo;
        this.adveSoyad = adveSoyad;
        this.kullaniciAdi = kullaniciAdi;
        this.dogumYili = dogumYili;
        this.cinsiyet = cinsiyet;
        this.sifre = sifre;
        System.out.println("Sisteme "+ this.adveSoyad+"kaydoldu.");
        this.girisYaptiMi = true;
    }
    public void kisaBilgiGoster(){
        if(this.girisYaptiMi){
            System.out.println("adı ve soyadı" +this.adveSoyad);
            System.out.println("kullanıcı adı"+ this.kullaniciAdi);
        }else{
            System.out.println("Lütfen önce giriş yapınız. ");
        }
        
    }
        public void oturumuKapat(){
            this.girisYaptiMi = false;
            System.out.println("Oturum kapatılıyor...");
        }
        public void oturumAc(String kullaniciAdi, String sifre){
          //this kullanarak çağırdık
          if(this.kullaniciAdi.equals(kullaniciAdi) && this.sifre.equals(sifre)){
              System.out.println("Başarıyla giriş yaptınız."); 
              this.girisYaptiMi= true;
           }else{
              System.out.println("Lütfen bilgilerinizi gözden geçirin.");
          }
          
        }
        public void kullaniciAdiDegistir(String yeniKullaniciAdi){
            this.kullaniciAdi = yeniKullaniciAdi;
            System.out.println("Kullanıcı adınız değiştirildi.Yeni kullanıcı adı : " + yeniKullaniciAdi);
        }
        public void satisYap(){
           // sistem tarihini getir Calendar cal = Calendar.getInstance();if((cal.get(Calendar.YEAR) - this.dogumYili) >= 18){
            if(this.girisYaptiMi){
                if((2020 - this.dogumYili) >= 18){
                System.out.println("satış yapma hakkına sahipsiniz.");
            }else{
                System.out.println("yaşınız bu sistemi kullanmak için uygun görülmemiştir");
             }
            }else{
                System.out.println("önce sisteme giriş yapınız");
            }
        }
    }
    
    

