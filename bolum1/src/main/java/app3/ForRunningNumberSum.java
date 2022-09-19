package app3;

public class ForRunningNumberSum {
    public static void main(String[] args) {

        int toplam = 0;

        for (int number = 1; number <=1000 ; number++) {
            System.out.println("Şuanki sayı : " + number );
            toplam += number;
            System.out.println("Şunaki toplam : " + toplam);
        }
    }
}
