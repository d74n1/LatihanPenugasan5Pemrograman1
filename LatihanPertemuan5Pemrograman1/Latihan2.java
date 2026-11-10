// 2. Cetak Positif, Negatif, atau Nol.


package LatihanPertemuan5Pemrograman1;
import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner lat = new Scanner(System.in);

        System.out.println("Masukan Angka: ");
        int angka = lat.nextInt();

        if (angka > 0) {
            System.out.println("Positif");
        } else if (angka < 0) {
            System.out.println("Negatif");
        } else {
            System.out.println("Nol");
        }

        lat.close();
    }
}
