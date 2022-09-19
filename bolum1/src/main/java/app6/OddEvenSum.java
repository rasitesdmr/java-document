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
        int tekCiftFark;

        int number = altSinir;

        if (altSinir > ustSinir){
            System.out.println("Alt sınır , üst sınırdan büyük olamaz");
        }

        while (number <= ustSinir) {
            if (number % 2 == 0) {
                ciftToplam += number;
            } else {
                tekToplam += number;
            }
            ++number;
        }

        if (tekToplam < ciftToplam){
            tekCiftFark = ciftToplam - tekToplam;
        }else {
            tekCiftFark = tekToplam - ciftToplam;
        }

        System.out.println("Girmiş olduğunuz sayı aralığındaki çift sayıların toplamı : " + ciftToplam);
        System.out.println("Girmiş olduğunuz sayı aralığındaki tek sayıların toplamı : " + tekToplam);
        System.out.println("Tek ve çift sayıları arasındaki fark : " + tekCiftFark );
        scanner.close();
    }
}
