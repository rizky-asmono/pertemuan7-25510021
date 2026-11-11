import java.util.Locale;
import java.util.Scanner;
 
public class LuasSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
 
        // Input alas, tinggi
        System.out.print("Masukkan alas   : ");
        double alas = input.nextDouble();
        System.out.print("Masukkan tinggi : ");
        double tinggi = input.nextDouble();
 
        // luas = 0.5 x alas x tinggi
        double luas = 0.5 * alas * tinggi;
 
        // Output luas
        System.out.println("Luas segitiga   = " + luas);
        input.close();
    }
}
