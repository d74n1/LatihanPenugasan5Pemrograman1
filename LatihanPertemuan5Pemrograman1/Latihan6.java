// 6. Tentukan jenis segitiga dari tiga sisi: sama sisi, sama kaki, sembarang, atau bukan segitiga


package LatihanPertemuan5Pemrograman1;
import java.util.Scanner;

public class Latihan6 {
    public static void main(String[] args) {
        Scanner lat = new Scanner(System.in);

        int a, b, c;
		System.out.print("Masukan bilangan A: ");
		a = lat.nextInt();
		System.out.print("Masukan bilangan B: ");
		b = lat.nextInt();
		System.out.print("Masukan bilangan C: ");
		c = lat.nextInt();
		
		if ((a + b > c) && (a + c > b) && (b + c > a)) {
            if (a == b && b == c) {
                System.out.println("Jenis: Segitiga Sama Sisi");
            } else if (a == b || b == c || a == c) {
                System.out.println("Jenis: Segitiga Sama Kaki");
            } else {
                System.out.println("Jenis: Segitiga Sembarang");
            }
        } else {
            System.out.println("Bukan segitiga (tidak memenuhi syarat sisi)");
        }

        lat.close();
    }
}
