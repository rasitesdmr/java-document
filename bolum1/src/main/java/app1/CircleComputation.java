package app1;

import java.util.Scanner;

public class CircleComputation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double alan , yaricap, cevre ;
        // PI sayısının değiştirilmesini istemediğimiz için final olarak tanımladık.
        final double PI = 3.14159265;

        System.out.print("Bir yarıçap değişkeni giriniz:");
         yaricap = scanner.nextDouble();

        alan = yaricap * yaricap * PI;
        cevre = 2.0 * PI * yaricap;

        System.out.println("Girdiğiniz yariçap değeri : " + yaricap);
        System.out.println("Dairenin alanı : " + alan);
        System.out.println("Dairenin çevresi : " + cevre);
        scanner.close();


    }
}
