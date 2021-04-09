
public class NotHesaplamaChar {
public static void main(String[] args) {
    System.out.print("Harf Notu: " + notuGetir(78.5));
    System.out.print("\nHarf Notu: " + notuGetir(59.5));
  }

  public static char notuGetir (double not) {
    if (not >= 90.0)
      return 'A';
    else if (not >= 80.0)
      return 'B';
    else if (not >= 70.0)
      return 'C';
    else if (not >= 60.0)
      return 'D';
    else
      return 'F';
  }    
}
