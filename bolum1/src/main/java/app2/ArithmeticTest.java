package app2;

import java.util.Scanner;

public class ArithmeticTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı  giriniz : ");
        double number1 = scanner.nextDouble();
        System.out.print("Bir sayı giriniz : ");
        double number2 = scanner.nextDouble();

        double toplama , cikarma , bolme , kalan ;

        toplama = number1 + number2;
        // TODO Math.abs(number1) : Sayıları mutlak değere alır.
        cikarma = number1 - number2;
        bolme = number1 / number2;
        kalan = number1 % number2;

        System.out.println("******************************************************");
        System.out.println("Giriğiniz sayılar : " + number1 + " , " + number2);
        System.out.println("Girdiğiniz sayıların toplamı : " + toplama);
        System.out.println("Girdiğiniz sayıların farkı : " + cikarma);
        System.out.println("Girdiğiniz sayıların bölümü : " + bolme);
        System.out.println("Girdiğiniz sayıların kalanı : " + kalan);
        System.out.println("******************************************************");

        ++number1;
        --number2;

        System.out.println("******************************************************");
        System.out.println("Giriğiniz il sayıyı 1 artırdık  : " + number1);
        System.out.println("Giriğiniz ikinci sayıyı 1 azalttık  : " + number2);
        System.out.println("Girdiğiniz sayıların toplamı : " + toplama);
        System.out.println("Girdiğiniz sayıların farkı : " + cikarma);
        System.out.println("Girdiğiniz sayıların bölümü : " + bolme);
        System.out.println("Girdiğiniz sayıların kalanı : " + kalan);
        System.out.println("******************************************************");

        scanner.close();




    }
}
