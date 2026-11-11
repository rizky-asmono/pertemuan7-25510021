import java.util.Scanner;
 
public class KasirDiskon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;
        char lagi;
 
        do {
            System.out.print("Harga barang : ");
            double harga = input.nextDouble();
            System.out.print("Jumlah       : ");
            int jumlah = input.nextInt();
            total = total + harga * jumlah;
 
            System.out.print("Tambah barang lagi? (y/t): ");
            lagi = input.next().charAt(0);
        } while (lagi == 'y' || lagi == 'Y');
 
        double diskon = 0;
        if (total > 100000) {
            diskon = 0.1 * total;
        }
        System.out.println("Total belanja : " + total);
        System.out.println("Diskon        : " + diskon);
        System.out.println("Total bayar   : " + (total - diskon));
        input.close();
    }
}
