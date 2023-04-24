package pratices.day_05;

import java.util.Scanner;

public class C01_Switch {
    /*Kullanıcıdan 0-4 arası sınav puanın sistemine girmesini isteyiniz
       Eger puanı 0.0-1.0 arasında ise KALDI SEVİYESİ veriniz.
       puanı 2.0-2.5 arasında ise İYİ Seviyesi veriniz.
       puanı 2.5-3.5 arasında ise ÜST Seviyesi veriniz.
       puanı 3.5-4.0 arasında ise HARİKA Seviyesi veriniz.

       switch case kullanarak KALDI  seviyesine F harf notu veriniz.
                              GEÇTİ  seviyesine D harf notu veriniz.
                              İYİ    seviyesine C harf notu veriniz.
                              ÜST    seviyesine B harf notu veriniz.
                              HARİKA seviyesine A harf notu veriniz.


     */
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen 0-4 arasında almış olduğunuz sınav notunu giriniz...");
         double puan = input.nextDouble();
         String seviye="";
        if(puan>=0 && puan<1){
            seviye="KALDI";
        }else if(puan>=1 && puan<2){
            seviye="GECTI";
        }else if(puan>=2 && puan<2.5){
            seviye="IYI";
        }else if(puan>=2.5 && puan<3.5){
            seviye="UST";
        }else if(puan>=3.5 && puan<=4){
            seviye ="HARIKA";
        }


        switch (seviye){

            case "KALDI":
                System.out.println("F");
                break;

            case "GECTI":
                System.out.println("D");
                break;

            case "IYI":
                System.out.println("C");
                break;

            case "UST":
                System.out.println("B");
                break;

            case "HARIKA":
                System.out.println("A");
                break;

            default:
                System.out.println("Sinav Puaninizi Dogru Giriniz");







        }








    }
}





