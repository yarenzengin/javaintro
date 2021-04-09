public class TestOverloading {
    public static void main(String[] args) {
        AA a=new AA();
        a.p(10);
        a.p(10.0);
    }
}

class BB{
   public void p(double i){
       System.out.println(i*2);
   } 
}
 class AA extends BB{
     public void p(int i){
         System.out.println(i);
     }
 }
