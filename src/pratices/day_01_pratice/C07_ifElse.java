package pratices.day_01_pratice;

import java.util.Scanner;

public class C07_ifElse {
    public static void main(String[] args) {

        // Kullanicidan ayri ayri sisteme iki sayi girmesini isteyiniz.
        // ilk sayinin ikinci sayidan buyuk olup olmadıgını yazdırın

        Scanner scan = new Scanner(System.in);

        System.out.println("lk Sayiyi giriniz");
        int ilksayi = scan.nextInt();

        System.out.println("Ikinci Sayiyi giriniz");
        int Ikincisayi = scan.nextInt();

        if (ilksayi>Ikincisayi){
            System.out.println("Ilk sayi ikinci sayidan buyuktur");

        }else {
            System.out.println("ilk sayi ikinci sayidan buyuk degildir");

        }
        }


    }

