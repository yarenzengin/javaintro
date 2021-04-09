public class TestHayvan {
    public static void main(String[] args) {
        Hayvan hayvan=new Kedi("Minnoş");
        Hayvan hayvan2=new Kopek("Karabaş");
        Hayvan hayvan3=new At("DülDül");
        
        System.out.println(hayvan.konus());
        System.out.println(hayvan2.konus());
        System.out.println(hayvan3.konus());
    }
}