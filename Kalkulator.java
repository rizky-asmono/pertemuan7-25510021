import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;
        do {
            System.out.println("\n=== KALKULATOR SEDERHANA ===");
            System.out.print("Masukkan bilangan pertama : ");
            double bil1 = input.nextDouble();

            System.out.print("Masukkan operator (+, -, *, /): ");
            char op = input.next().charAt(0);

            System.out.print("Masukkan bilangan kedua   : ");
            double bil2 = input.nextDouble();

            if (op == '/' && bil2 == 0) {
                System.out.println("Error: Tidak dapat membagi dengan nol");
            } else {
                double hasil = 0;
                boolean valid = true;
                switch (op) {
                    case '+':
                        hasil = bil1 + bil2;
                        break;
                    case '-':
                        hasil = bil1 - bil2;
                        break;
                    case '*':
                        hasil = bil1 * bil2;
                        break;
                    case '/':
                        hasil = bil1 / bil2;
                        break;
                    default:
                        System.out.println("Operator tidak valid!");
                        valid = false;
                }
                if (valid) {
                    System.out.println("Hasil: " + bil1 + " " + op + " " + bil2 + " = " + hasil);
                }
            }
            System.out.print("\nApakah ingin menghitung lagi? (y/t): ");
            ulang = input.next().charAt(0);
        } while (ulang == 'y' || ulang == 'Y');
        System.out.println("Program selesai. Terima kasih!");
        input.close();
    }
}