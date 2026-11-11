import java.util.Scanner;
 
public class Kelulusan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Nama  : ");
        String nama = input.nextLine();
        System.out.print("Nilai : ");
        int nilai = input.nextInt();
 
        if (nilai >= 60) {
            System.out.println(nama + " dinyatakan LULUS");
        } else {
            System.out.println(nama + " dinyatakan TIDAK LULUS");
        }
        input.close();
    }
}
