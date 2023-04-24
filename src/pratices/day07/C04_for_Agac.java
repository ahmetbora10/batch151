package pratices.day07;

import java.util.Scanner;

public class C04_for_Agac {
    public static void main(String[] args) {

         /*

         Agac sekli olusturmak icin, kullanicidan yaprak satir sayisini ve gövde satir sayisini ayrı ayrı
         sisteme girmesini isteyiniz.

         Asagıdaki agac seklini konsala yazdırınız


        ^
        ^^
        ^^^
        ^^^^
        ^^^^^
        |||
        |||
        |||
        |||
        |||


         */
        Scanner scan =new Scanner(System.in);
        System.out.println("Yaprak Satır Sayısını Giriniz");
        int yapraksatırsayısı= scan.nextInt();


        System.out.println("Gövde Satır Sayısını Giriniz");
        int Gövdesatırsayısı= scan.nextInt();
        String yaprak="";
        String  gövde="";

        for (int i=0; i<yapraksatırsayısı;i++){
            yaprak=yaprak+"^";
            System.out.println(yaprak);

        }
        for (int i=0;i<Gövdesatırsayısı; i++){
            System.out.println("||");

        }
    }
}
