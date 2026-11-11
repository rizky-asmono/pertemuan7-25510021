import java.util.Scanner;

public class DataMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int m = input.nextInt();
        input.nextLine(); 

        int jumlahLulus = 0;

        System.out.println("\n=== INPUT DATA MAHASISWA ===");
        for (int i = 1; i <= m; i++) {
            System.out.println("\nMahasiswa ke-" + i);
            System.out.print("Nama  : ");
            String nama = input.nextLine();

            System.out.print("Nilai : ");
            int nilai = input.nextInt();
            input.nextLine(); 

            String status;
            if (nilai >= 60) {
                status = "Lulus";
                jumlahLulus++;
            } else {
                status = "Tidak Lulus";
            }

            System.out.println("Status: " + status);
        }

        System.out.println("\n===================================");
        System.out.println("Jumlah mahasiswa yang LULUS: " + jumlahLulus + " dari " + m + " mahasiswa.");

        input.close();
    }
}