// 1. Cek sebuah angka genap atau ganjil


package LatihanPertemuan5Pemrograman1;
import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner lat = new Scanner(System.in);
        
        System.out.println("Masukan Angka: ");
        int angka = lat.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Angka " + angka + " adalah bilangan genap ");
        } else {
            System.out.println("Angka " + angka + " adalah bilangan ganjil");
        }

        lat.close();
    }
}
