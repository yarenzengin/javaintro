
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class dosyaIslemleri {

    public static void main(String[] args) {
        //dosyaOlustur();
        //dosyaBilgileriniGetir();
//        dosyaOku();
//        dosyayaYaz();
//        dosyaOku();
        dosyaSil();
    }

    public static void dosyaOlustur() {
        File dosya = new File("C:\\Users\\Zeynep\\Documents\\NetBeansProjects\\Dosyalarim\\deneme.txt");
        try {
            if (dosya.createNewFile()) {
                System.out.println("Dosya oluşturuldu.");
            } else {
                System.out.println("Dosya zaten vardı.");
            }

        } catch (IOException iOException) {
        }
    }

    public static void dosyaBilgileriniGetir() {
        File dosya = new File("C:\\Users\\Zeynep\\Documents\\NetBeansProjects\\Dosyalarim\\deneme.txt");
        if (dosya.exists()) {
            System.out.println("Dosya Adı: " + dosya.getName());
            System.out.println("Dosya Yolu: " + dosya.getAbsolutePath());
            System.out.println("Dosya yazılabilir mi?: " + dosya.canWrite());
            System.out.println("Dosya okunabilir mi?: " + dosya.canRead());
            System.out.println("Dosya boyutu (byte): " + dosya.length());
        }
    }

    public static void dosyaOku() {
        File dosya = new File("C:\\Users\\Zeynep\\Documents\\NetBeansProjects\\Dosyalarim\\deneme.txt");
        try {
            Scanner okuyucu = new Scanner(dosya);
            while (okuyucu.hasNextLine()) {
                String satir = okuyucu.nextLine();
                System.out.println(satir);
            }
            okuyucu.close();
        } catch (FileNotFoundException fileNotFoundException) {
        }
    }

    public static void dosyayaYaz() {
        try {
            FileWriter yazici = new FileWriter("C:\\Users\\Zeynep\\Documents\\NetBeansProjects\\Dosyalarim\\deneme.txt", true);
            yazici.write("\nYönetim Bilişim Sistemleri");
            System.out.println("Dosyaya yazıldı.");
            yazici.close();

        } catch (IOException iOException) {
        }
    }

    public static void dosyaSil() {
        File silinecekDosya = new File("C:\\Users\\Zeynep\\Documents\\NetBeansProjects\\Dosyalarim");
        try {
            if(silinecekDosya.delete()){
                System.out.println(silinecekDosya.getName() + " silindi.");
            }
            else{
                System.out.println("Silme başarısız.");
            }
        } catch (Exception e) {
        }
    }

}