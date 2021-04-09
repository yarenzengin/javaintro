



public class TestCember {
    public static void main(String[] args) {
        Cember cember1= new Cember();
        cember1.yariCapGuncelle(5);
        System.out.println("Alanı: "+cember1.alanHesapla());
        System.out.println("Cevresi: "+cember1.cevreHesapla());
        
        Cember cember2=new Cember(15);//parametreli constructer yeni değerini güncellemiş oldu
        System.out.println("Alanı: "+cember2.alanHesapla());
        System.out.println("Cevresi: "+cember2.cevreHesapla());
        
        //tek satırlık nesnelerde kolaylık olur
        System.out.println(new Cember(100).alanHesapla());
        System.out.println(new Cember(100).cevreHesapla());
        
        
    }
}
