// 5. Kalkulator dengan operator + - * / %, dan tolak pembagian dengan nol.


package LatihanPertemuan5Pemrograman1;
import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {
        Scanner lat = new Scanner(System.in);

        System.out.print("Masukkan angka 1: ");
        double a = lat.nextDouble();
        System.out.print("Masukkan Operator: ");
        char op = lat.next().charAt(0);
        System.out.print("Masukkan angka 2: ");
        double b = lat.nextDouble();

        switch (op) {
            case '+': System.out.println(a + b); break;
            case '-': System.out.println(a - b); break;
            case '*': System.out.println(a * b); break;
            case '/':
                if (b == 0)
                    System.out.println("Tidak bisa dibagi nol");
                else
                    System.out.println(a / b);
                break;
            default: System.out.println("Operator tidak dikenal");
        }

        lat.close();
    }
}
