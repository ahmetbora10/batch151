package smalstady.arrays03;

import java.util.Scanner;

public class C06_arrays {
    public static void main(String[] args) {
        /*7.soru Verilen bir Array`in istenen bir  elemani icerip icerdigini kontol eden
        true veya false sonucu donen bir method olusturun
         */
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfrn kontrol icin bir isim giriniz");
        String arananIsim=scan.nextLine();
        String isimler[]={"furkan","veli","huseyin","hakan","ali","ece","isa","cem","ibrahim"};
        contains(isimler,arananIsim);

    }
    public  static void contains(String[ ] isimler, String arananIsim){
        boolean sonuc=false;
        for (int i=0;i<isimler.length;i++){
            if (isimler[i].equalsIgnoreCase(arananIsim)){
                sonuc=true;
            }
        }
        System.out.println(sonuc);
    }
}
