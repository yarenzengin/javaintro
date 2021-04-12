
public class Program {
    public static void main(String[] args) {
        PersonelSinifi yaren = new PersonelSinifi("Yaren  ", "Zengin","yaren@gmail.com",1999,9305 );
       yaren.personelYasHesapla();
        System.out.println("*******************");
       Yazilim eray =  new Yazilim("Java,PHYTON,HTML", "www.erayzengin.github.com", "eray", "zengin","eray5@gmail.com", 2000, 4646);
       eray.yazilimProgramlamaDilleriniGoster();
       eray.personelYasHesapla();
        System.out.println("***************************");
        Yonetici busra = new Yonetici("bilgi işlem",124,"busra  ", "şenocak","busra65@gmail.com",2001,4334);
        busra.yoneticiBilgileriniGoster();
        busra.personelYasHesapla();
        System.out.println("***************************");

       
       
       
       
    }
}
