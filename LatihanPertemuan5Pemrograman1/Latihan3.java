// 3. Ubah nilai angka menjadi grade A sampai D, lalu cetak status Lulus (nilai 55 ke atas) dengan ternary


package LatihanPertemuan5Pemrograman1;
import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner lat = new Scanner(System.in);
        
        System.out.println("Berapa Nilainya = ");
        int nilai = lat.nextInt();

        String grade = (nilai >= 85) ? "A" :
                       (nilai >= 70) ? "B" :
                       (nilai >= 55) ? "C" : "D";

        String status = (nilai >= 55) ? "Lulus" : "Tidak Lulus";

        System.out.println("Nilai  : " + nilai);
        System.out.println("Grade  : " + grade);
        System.out.println("Status : " + status);

        lat.close();
    }
}
