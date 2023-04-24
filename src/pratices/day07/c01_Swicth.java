package pratices.day07;

import java.util.Scanner;

public class c01_Swicth {
    public static void main(String[] args) {
 /*
       Kullanıcıdan yıl ve ay numarasını ayrı ayrı sisteme girmesini isteyiniz.
       Girilen ay numarasına göre ayin kaç gün çektigini yazdırınız.


       NOT: 1, 3, 5, 7, 8, 10, 12. aylar 31 gun çeker
            4, 6, 9, 11. aylar 30 gun çeker
            2. ay 4 yılda bir 29 gun ceker, diger yıllarda 28 gun ceker
        */
        // 1)Scanner objesi olustur
        //2)kullanicidan ay numarasi girmesini isteyiniz
        //3) Şubat ayında yılı girilecek çünkü 4 yılda bir şubat 29 çekiyor.


        Scanner Scan = new Scanner(System.in);
        System.out.println("Lütfen yılı giriniz...");
        int yil = Scan.nextInt();
        System.out.println("1 ile 12 arası ay numarasını giriniz...");
        int ayno = Scan.nextInt();

        switch (ayno) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                int gün = 31;
                System.out.println("Girdiğiniz Ay" + gün + "Gün Ceker");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                gün = 30;
                System.out.println("Girdiğiniz Ay" + gün + "Gün Ceker");
                break;

            case 2:
                if (yil % 4 == 0) {
                    gün = 29;
                    System.out.println("Girdiğiniz Ay" + gün + "Gün Ceker");
                } else {
                    gün = 28;
                    System.out.println("Girdiğiniz Ay" + gün + "Gün Ceker");

                }
                break;


            default:
                System.out.println("Lütfen geçerli bir ay numarası giriniz..");

        }
    }
}
