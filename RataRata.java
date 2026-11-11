import java.util.Scanner;
 
public class RataRata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Berapa bilangan? ");
        int n = input.nextInt();
 
       if (n <= 0) {
            System.out.println("Tidak ada data");
        } else {
            int total = 0;
            for (int i = 1; i <= n; i++) {
                System.out.print("Bilangan ke-" + i + " : ");
                int angka = input.nextInt();
                total = total + angka;
            }
 
        double rata = (double) total / n;
        System.out.println("Total     = " + total);
        System.out.println("Rata-rata = " + rata);
        input.close();
    }
    }}
