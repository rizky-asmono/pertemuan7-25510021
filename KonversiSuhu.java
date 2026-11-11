import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan suhu dalam Celcius: ");
        double celcius = input.nextDouble();

        double fahrenheit = (celcius * 9 / 5) + 32;
        double reamur = celcius * 4 / 5;
        double kelvin = celcius + 273.15;

        System.out.println("\n=== HASIL KONVERSI SUHU ===");
        System.out.println("Celcius    : " + celcius + " °C");
        System.out.println("Fahrenheit : " + fahrenheit + " °F");
        System.out.println("Reamur     : " + reamur + " °R");
        System.out.println("Kelvin     : " + kelvin + " K");

        input.close();
    }
}