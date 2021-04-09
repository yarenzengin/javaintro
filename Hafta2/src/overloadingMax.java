 
public class overloadingMax {
    public static void main(String[] args) {
       // System.out.println(Math.max(3.5, 5.7));
        
        System.out.println(max(3, 4));
        System.out.println(max(4.5, 6.8));
        System.out.println(max(4.5, 3, 1.2));
        
    }
    
    public static int max(int n1,int n2){
        if(n1>n2){
            return n1;
        }
        else{
           return n2;
        }
    }
    
    public static double max(double n1,double n2){
        if(n1>n2){
            return n1;
        }
        else{
           return n2;
        }
    }
    
    public static double max(double n1,double n2,double n3){
        return max(max(n1,n2),n3);
    }
    
}
