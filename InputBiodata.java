import java.util.Locale;
import java.util.Scanner;
 
public class InputBiodata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         input.useLocale(Locale.US);
        System.out.print("Nama       : ");
        String nama = input.nextLine();
        System.out.print("Umur       : ");
        int umur = input.nextInt();
        System.out.print("IPK        : ");
        double ipk = input.nextDouble();
        System.out.print("Aktif (true/false): ");
        boolean aktif = input.nextBoolean();
 
        System.out.println("\n=== BIODATA ===");
        System.out.println("Nama  : " + nama);
        System.out.println("Umur  : " + umur + " tahun");
        System.out.println("IPK   : " + ipk);
        System.out.println("Aktif : " + aktif);
        input.close();
    }
}

