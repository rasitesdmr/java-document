package app6;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen alt sınır değerini giriniz : ");
        int altSinir = scanner.nextInt();
        System.out.print("Lütfen üst sınır değerini giriniz : ");
        int ustSinir = scanner.nextInt();

        int tekToplam = 0;
        int ciftToplam = 0;

        int number = altSinir;

        while (number <= ustSinir) {
            if (number % 2 == 0) {
                ciftToplam += number;
            } else {
                tekToplam += number;
            }
            ++number;
        }

        System.out.println("Girmiş olduğunuz sayı aralığındaki çift sayıların toplamı : " + ciftToplam);
        System.out.println("Girmiş olduğunuz sayı aralığındaki tek sayıların toplamı : " + tekToplam);
        scanner.close();
    }
}
