package introduction.day03scanner;


import java.util.Scanner;

public class Scanner05 {

    public static void main(String[] args) {

        /*
        Kullanici'dan bir dikdortgenin iki kenar uzunlugunu aliniz.
         1) Alanini hesaplayiniz ==> Kisa kenar * Uzun kenar
         2) Cevresini hesaplayiniz ==> 2 * Kisa kenar + 2 * Uzun kenar  */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen dikdorgenin kisa kenarini giriniz...");
        double Shortside= input.nextDouble();
        System.out.println("Lutfen Dikdortgenin uzun kenarini giriniz...");
        double Longside= input.nextDouble();
        double Alan=Shortside*Longside;
        System.out.println("Alan = " + Alan);

        double Cevre= 2*Shortside+2*Longside;
        System.out.println("Cevre = " + Cevre);







    }
}
