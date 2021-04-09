
public class Test {
 
    public static void main(String[] args) {
         
        try{
             for(int i = 0 ; i <2; i++){
            System.out.print(i + " ");
            System.out.println(1 / 0);
        }
        }catch(Exception ex){
            System.out.println("Aritmatik Exception");
        } 
    }
}
//12.2
        //System.out.println(1 / 0);
        //System.out.println(1.0 / 0);

//12.3
        //long value = Long.MAX_VALUE+1;
        //System.out.println(value);
        //  9223372036854775807
        // -9223372036854775808
        
//12.5
//        try {
//            int value = 30;
//            if (value < 40) {
//
//                throw new Exception("value is too small");
//
//            }
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//            System.out.println("Burası çalışıyor mu?");
//        }
//        System.out.println("Continue after the catch block");

//12.8
//        System.out.println(1 / 0); // ArithmeticException

//        int[] list = new int[5];
//        System.out.println(list[5]); // ArrayIndexOutOfBoundsException
   
//        String s = "abc";
//        System.out.println(s.charAt(3)); //StringIndexOutOfBoundsException

//        Object o = new Object();  
//        String d = (String) o;    //ClassCastException

//        Object o = null;
//        System.out.println(o.toString()); //NullPointerException

 //       System.out.println(1.0 / 0);  // Infinity - Hata yok

    