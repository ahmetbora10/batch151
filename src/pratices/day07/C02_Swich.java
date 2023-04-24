package pratices.day07;

import java.util.Scanner;

public class C02_Swich {
    public static void main(String[] args) {

         /*
     Bir ATM'de aşağıdaki banka işlemlerini yapmak için, kullanicidan 1-4 arası işlem numarasını sisteme girmesini isteyiniz.

     işlem 1: Bakiye Sorgulama
     işlem 2: Para Cekme
     işlem 3: Para Yatırma
     işlem 4: İşlemi Sonlandırın

     Ve bu islemleri Switch case kullanarak yaptırınız.
     */
        Scanner scan=new Scanner(System.in);
        System.out.println("1-4 Arası İşlem Numaranizi Giriniz" +"\n"+
                "işlem 1: Bakiye Sorgulma" +"\n"+
                "İşlem 2:Para Çekme" +"\n"+
                "İşlem 3:Para Yatırma"+"\n"+
                "İşlem 4:İşlemi Sonlandır");
        int İşlemNo=scan.nextInt();
        int Bakiye =1000;

        switch (İşlemNo){
            case  1://Bakiye Sorgulama
                System.out.println("Bakiyeniz"+"bakiye"+"TL");
                break;

            case  2://Para Çekme
                System.out.println("Lütfen çekmek istediğiniz para miktarını giriniz");
                int Cekilecekpara= scan.nextInt();
                if(Cekilecekpara<=Bakiye){
                    Bakiye =  Bakiye-Cekilecekpara;
                    System.out.println("Para Cekme Isleminden Sonraki Mevcut Bakiyeniz: " + Bakiye + "TL");
                }else{
                    System.out.println("Bakiyeniz Yetersiz");
                }
                break;
            case 3: // Para Yatirma
                System.out.println("Yatirmak Istediginiz Parayi Giriniz");
                int yatirilacakPara = scan.nextInt();
                if(yatirilacakPara<=2000){
                    Bakiye =  Bakiye + yatirilacakPara;
                    System.out.println("Para Yatirma Isleminden Sonraki Mevcut Bakiyeniz: " +Bakiye + "TL");
                }else{
                    System.out.println("ATM'de Gunluk Para Yatirma Limiti 2000TL");
                }
                break;
            case 4: // Islemi Sonlandir
                System.out.println("Techpro Bank'ı Kullandiginiz Icin Tesekkur Ederiz");
                break;
            default:
                System.out.println("Gecerli Bir Numara Giriniz");
        }


    }

}


