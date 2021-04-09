
public class NotHesaplama {
 public static void main(String[] args) {
    System.out.print("Harf Notu: " );
    notYazdir(98.5);
    System.out.print("Harf Notu: " );
    notYazdir(69.5); 
  }

  public static void notYazdir(double not) {
    if (not >= 90.0) {
      System.out.println('A');
    } 
    else if (not >= 80.0) {
      System.out.println('B');
    } 
    else if (not >= 70.0) {
      System.out.println('C');
    } 
    else if (not >= 60.0) {
      System.out.println('D');
    } 
    else {
      System.out.println('F');
    }    
}
}

