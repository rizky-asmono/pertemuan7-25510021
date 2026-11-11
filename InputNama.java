   import java.util.Scanner;// import class Scanner
 
public class InputNama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   // membuat objek Scanner
 
        System.out.print("Masukkan nama lengkap : ");
        String nama = input.nextLine();           // membaca satu baris
 
        System.out.print("Masukkan kota asal    : ");
        String kota = input.next();               // membaca satu kata
 
        System.out.println("Halo " + nama + " dari " + kota + "!");
        input.close();
    }
}
