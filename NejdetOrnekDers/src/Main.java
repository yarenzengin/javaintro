
public class Main {
   String marka;
   String model;
   String renk;
   int uretimYili;
   int pilYuzdesi;
   String arabaSahibi;

    public Main(String marka, String model, String renk, int uretimYili,int pilYuzdesi,String arabaSahibi) {
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.uretimYili = uretimYili;
        this.pilYuzdesi = pilYuzdesi;
        this.arabaSahibi = arabaSahibi;
        System.out.println("yeni bir araba nesnesi türetildi");
    }
      public void arabaBilgileriniGoster(){
          System.out.println("arabanın markası " + this.marka);
          System.out.println("arabanın modeli " + this.model);
          System.out.println("arabanın rengi " + this.renk);
          System.out.println("arabanın üretim yılı " + this.uretimYili);
          System.out.println("Arabanın pil sağlığı % " + this.pilYuzdesi);
          System.out.println("Arabanın Sahibi " + this.arabaSahibi);
          System.out.println("bu bilgiler sahibinden sitesinden çekilmiştir.");
      
        
        
        
            
            
        
    }
        
        
        
        
        
    }
         




    

