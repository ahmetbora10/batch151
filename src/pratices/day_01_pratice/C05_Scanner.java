package pratices.day_01_pratice;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        /*

        Kullanıcıdan adını, soyadını, yaşını, boyunu ve kilosunu ayrı ayrı sisteme girmesini isteyin
        ve bunları şu şekilde konsola yazdırın:

        Adı: ...
        Soyadı: ...
        Yas: ...
        Boy: ...
        Kilo: ...

	    */
        Scanner scan =new Scanner(System.in);
        System.out.println("Adinizi Giriniz");
        String  ad = scan.nextLine();
        System.out.println("Soyadinizi Giriniz");
        String soyad = scan.nextLine();
        System.out.println("Yasinizi Giriniz");
        int Yas = scan.nextInt();
        System.out.println("Boyunuzu Giriniz");
        double Boy = scan.nextDouble();
        System.out.println("kilonuzu giriniz");
        double kilo = scan.nextDouble();
        System.out.println();






    }
}
