package javaders.day09stringmanipulationsifstatement;

public class C02_ifStatement {

    public static void main(String[] args) {


        // INTERWIEW QUESTINS USA QA

        // Bir Stringdeki tekrarsiz karakterleri ekrana yazdiriniz
        //   String y ="abbccdc"

        String y ="aac";//c   SORU COZUMU COK UZAMAMSI ICIN  BU SEKILDE ALINDI
        char ch = y.charAt(0);
        if(y.indexOf(ch) == y.lastIndexOf(ch)){
            System.out.println(ch);
        }//if body iki curly braces arasi
        char ch1 = y.charAt(1);
        if(y.indexOf(ch1) == y.lastIndexOf(ch1)){
            System.out.println(ch1);
        }//if body
        char ch2 = y.charAt(2);
        if(y.indexOf(ch2)== y.lastIndexOf(ch2)){
            System.out.println(ch2);

            // Ex : Verilen sayi pozitif ise ekrana "Sayi Pozitif " yazdiran kodu yaziniz

            int num= 65;
            if(num>0){
                System.out.println();
            }

        }



    }
}
