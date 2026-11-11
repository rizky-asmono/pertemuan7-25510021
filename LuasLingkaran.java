import java.util.Locale;
import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        
        System.out.print("Masukkan jari-jari : ");
        double r = input.nextDouble();

        
        double luas = Math.PI * r * r;
        double keliling = 2 * Math.PI * r;

        // Output hasil
        System.out.println("Luas lingkaran     = " + luas);
        System.out.println("Keliling lingkaran = " + keliling);

        input.close();
    }
}
