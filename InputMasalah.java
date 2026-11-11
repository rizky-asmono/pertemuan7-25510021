import java.util.Scanner;
 
public class InputMasalah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Umur : ");
        int umur = input.nextInt();
        // input.nextLine();   // <-- baris perbaikan
 
        System.out.print("Nama : ");
        String nama = input.nextLine();
 
        System.out.println("Nama = [" + nama + "], umur = " + umur);
        input.close();
    }
}

