public class HataCesitleri {
    public static void main(String[] args) {
        //int a=30/0;
        
//        int[] b={1,2,3,4,5};
//        System.out.println(b[6]);
        
//        try{
//          int a=30/0;  
//        }
//        catch(ArithmeticException e){
//            System.out.println("Sayılar 0 a bölünemez!!");
//        }

try{
        int[] b={1,2,3,4,5};
        System.out.println(b[6]);
}

catch(ArrayIndexOutOfBoundsException e){
    System.out.println("Dizi sınırı aşıldı");
    e.printStackTrace();
}
catch(IndexOutOfBoundsException e){//özelden genele doğru sıraladık
    
}
catch(RuntimeException e){
    
}
catch(Exception e){
        
}   

finally{
    
    System.out.println("Finally bloğundayız");
}

System.out.println("Buradayım");
        
        
        
    }
}