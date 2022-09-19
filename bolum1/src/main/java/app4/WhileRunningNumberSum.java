package app4;

public class WhileRunningNumberSum {
    public static void main(String[] args) {
        final int altSinir = 1;
        final int ustSinir = 1000;
        int toplam = 0;

        int number = altSinir;
        while (number <= ustSinir) {
            System.out.println("Sayımız :" + number);
            toplam += number;
            ++number;
            System.out.println("Toplam sayımız :" + toplam);
        }

    }
}
