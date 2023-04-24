package pratices.day_02;

import java.util.Scanner;

public class C03_IfElse {
    public static void main(String[] args) {

        /*
Kullanıcıdan ayrı ayrı iki kelime sisteme girmesini isteyin.
Eger İlk kelimenin karakter sayısı çift ise,
 ikinci kelimeyi birinci kelimenin ortasına koyun.
İlk kelimenin karakter sayısı tek ise, konsola
"ilk kelimenin ortasina ikinci kelimeyi koyamazsin cunku ilk kelime tek karakterli" yazdırın.
*/
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen birinci kelimeyi giriniz");
        String Kelime1 = input.next();
        System.out.println("Lütfen ikinci kelimeyi giriniz");
        String Kelime2 =input.next();


        if(Kelime1.length()%2==0){
            String ilkYarisi = Kelime1.substring(0,Kelime1.length()/2);
            String ikinciYarisi = Kelime1.substring(Kelime1.length()/2);
            System.out.println(ilkYarisi+Kelime2+ikinciYarisi);
        }else
            System.out.println("ilk kelimenin ortasina ikinci " +
                    "kelimeyi koyamazsin cunku ilk kelime tek karakterli");


    }//main

}