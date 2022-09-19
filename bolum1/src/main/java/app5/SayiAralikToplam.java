package app5;

import java.util.Scanner;

public class SayiAralikToplam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen toplamak istediğiniz sayı aralığının alt sınırını giriniz :");
        double altSinir = scanner.nextDouble();
        System.out.print("Lütfen toplamak istediğiniz sayı aralığının üst sınırını giriniz :");
        double ustSinir = scanner.nextDouble();

        double toplam = 0;


        while (Math.abs(altSinir) < Math.abs(ustSinir)) {
            for (double i = altSinir; i <= ustSinir; i++) {
                toplam += i;
            }
            System.out.println("Girmiş olduğunuz aralıktaki sayıların toplamı : " + toplam);
           break;
        }



    }


}
