package pratices.day_10_pratice;

import java.util.Scanner;

public class C01_BurcHesaplama {

    public static void main(String[] args) {
        //Kullanicidan dogdudu ay ve gun bilgilerini alarak burcunu hesaplatan kodu yaziniz
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dogdugunuz ayi String olarak giriniz..");
        String ay = scan.next();
        System.out.println("Dogdugunuz Gunu int Girinit");
        int gun = scan.nextInt();
        String burc = " ";

        if (ay.equalsIgnoreCase("ocak")) {
            if (gun > 22) {
                burc = "Kova";
            } else {
                burc = "Oglak";
            }
        }
        if (ay.equalsIgnoreCase("subat")) {
            if (gun > 20) {
                burc = "Balik";
            } else {
                burc = "Kova";
            }
        }
        if (ay.equalsIgnoreCase("mart")) {
            if (gun > 21) {
                burc = "Koc";
            } else {
                burc = "Balik";

            }
        }
        if (ay.equalsIgnoreCase("Nisan")) {
            if (gun > 21) {
                burc = "Boga";
            } else {
                burc = "Koc";
            }
        }
        if (ay.equalsIgnoreCase("Mayis")) {
            if (gun > 22) {
                burc = "Ikizler";
            } else {
                burc = "Boga";
            }
        }
        if (ay.equalsIgnoreCase("Haziran")) {
            if (gun > 23) {
                burc = "Yengec";
            } else {
                burc = "Ikizler";
            }
        }
        if (ay.equalsIgnoreCase("Temmuz")) {
            if (gun >23){
                burc = "Aslan";
            } else {
                burc = "Yengec";
            }
        }
        if (ay.equalsIgnoreCase("Agustos")) {
            if (gun > 22) {
                burc = "Kova";
            } else {
                burc = "Oglak";
            }
        }
        if (ay.equalsIgnoreCase("Eylul")) {
            if (gun > 22) {
                burc = "Kova";
            } else {
                burc = "Oglak";
            }
        }
        if (ay.equalsIgnoreCase("Ekim")) {
            if (gun > 22) {
                burc = "Kova";
            } else {
                burc = "Oglak";
            }
        }
        if (ay.equalsIgnoreCase("Kasim")) {
            if (gun > 22) {
                burc = "Kova";
            } else {
                burc = "Oglak";
            }
        }
        if (ay.equalsIgnoreCase("Aralik")) {
            if (gun > 22) {
                burc = "Kova";
            } else {
                burc = "Oglak";
            }
        }
    }
}
