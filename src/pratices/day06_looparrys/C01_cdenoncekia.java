package pratices.day06_looparrys;

import java.util.Scanner;

public class C01_cdenoncekia {

    /*
      Kullanıcıdan aldığınız 'c' ve 'a' iceren bir String değer içerisindeki
   'c' karakterinden önceki 'a' karakterlerinin sayısını bulan bir kod yazınız.
   */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen c ve a harflerini içeren bir kelime giriniz...");
        String str= scan.nextLine().toLowerCase();


        int counter=0;
        /*default deger toplama ve çıkarma işlemlerinde sıfırdır.
        (boş conteynır olmaz hafızada yer alsın diye difault bir karakter alınır.)
        String için ("") hiçlik alınır.
         */
                  // 1.YOL//
        for (int i=0; i<str.indexOf("c");i++) {
            if (str.charAt(i)=='a'){
                counter++;
            }//if body
        }//for body

//Her adımı görmek istiyorsan for loop'un içine yazdırırsınız.
        //sadece sonucu görmek isterseniz loop'un dışına yazdırırsınız.
        System.out.println("c'den önce "+counter+" a vardır");
        System.out.println("**************");

            //2.YOL//
        int sayac = 0;
        if (str.contains("c") && str.contains("a")) {
            System.out.println("");
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a') {
                    sayac++;
                } else if (str.charAt(i) == 'c') {
                    break;

                }//else if

            }//for loop
            System.out.println("C'den onceki 'a' sayisi " + sayac);
        } else {
            System.out.println("Lutfen 'c' ve 'a' harflerini iceren bir kelime giriniz");

        }
    }
}











