package pratices.day_01_pratice;

import java.util.Scanner;

public class C04_Dikdorgen {
    public static void main(String[] args) {
        // Kullanicidan dikdortgenin a ve b kenarlarinin uzunluklarini ayri ayri sisteme girmesini isteyiniz.
        // ve Dikdorgenin cevresini hesaplayarak ekrana yazdiriniz

        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen a kenarini giriniz");
        int a = input.nextInt();
        System.out.println("Lutfen b kenarini giriniz");
        int b = input.nextInt();

        int Cevre = 2*a+2*b;
        System.out.println("Cevre = " + Cevre);




    }
}
