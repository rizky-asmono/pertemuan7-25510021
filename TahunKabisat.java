import java.util.Scanner;

public class TahunKabisat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tahun: ");
        int tahun = input.nextInt();

        boolean isKabisat;

        if (tahun % 400 == 0) {
            isKabisat = true;
        } else if (tahun % 100 == 0) {
            isKabisat = false;
        } else if (tahun % 4 == 0) {
            isKabisat = true;
        } else {
            isKabisat = false;
        }

        System.out.println("\n=== HASIL PENGECEKAN TAHUN KABISAT ===");
        if (isKabisat) {
            System.out.println("Tahun " + tahun + " adalah TAHUN KABISAT.");
        } else {
            System.out.println("Tahun " + tahun + " BUKAN TAHUN KABISAT.");
        }

        input.close();
    }
}
