
public class Program {
    public static void main(String[] args) {
            Kus boncuk = new Kus("leylek", "beyaz", 5, "boncuk", "kuş", 2);
            System.out.println("bu hayvanın cinsi: " + boncuk.getCins());
            boncuk.setCins("karga");
            System.out.println("bu hayvanın cinsi : " + boncuk.getCins());
       
   
        
        
       Hayvan inek = new Hayvan("şebelek", "inek", 4);
        System.out.println("bu ineğin adı " + inek.getAd());
        inek.setAd("çile");
       System.out.println("bu ineğin adı " + inek.getAd());
        System.out.println("hayvanın türü" + inek.getTur());
        inek.setTur("köpek");
         System.out.println("hayvanın türü" + inek.getTur());
                At sarikiz = new At("Arap atı","arabistan","sarıkız","at",4);
        System.out.println("bu hayvan " + sarikiz.getTur() + "türünden" + sarikiz.getCins() + "cinsindendir");
        sarikiz.setTur("yılan");
        sarikiz.setCins("piton");
        System.out.println("bu hayvan " + sarikiz.getTur() + "türünden"+ sarikiz.getCins() + "cinsindendir");
  
      
      
      
      
      
    }
  
      
      
      
}
