// 4. Ubah angka 1 sampai 7 menjadi nama hari dengan switch (default untuk angka lain).


package LatihanPertemuan5Pemrograman1;
import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner lat = new Scanner(System.in);

        System.out.println("Masukkan angka 1 - 7:");
        int angka = lat.nextInt();
        String hari;

        switch (angka) {
            case 1: hari = "Senin"; break;
            case 2: hari = "Selasa"; break;
            case 3: hari = "Rabu"; break;
            case 4: hari = "Kamis"; break;
            case 5: hari = "Jumat"; break;
            case 6: hari = "Sabtu"; break;
            case 7: hari = "Minggu"; break;
            default: hari = "Angka tidak valid"; break;
        }

        System.out.println(hari);


        lat.close();
    }
}
