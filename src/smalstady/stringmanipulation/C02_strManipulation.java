package smalstady.stringmanipulation;

import java.util.Scanner;

public class C02_strManipulation {
    public static void main(String[] args) {
   /*
        Soru 2) Kullanicidan email adresini girmesini isteyin,
          mail @gmail.com icermiyorsa "Lutfen gmail adresi giriniz",
          @gmail.com ile bitiyorsa "Email adresiniz kaydedildi "
          @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen email adresi giriniz");
        String email= scan.nextLine();

        if (!email.contains("@gmail.com")){
            System.out.println("Lutfen gmail adresi giriniz");
        }
        else if (email.contains(" ")) {
            System.out.println("lutfen bosluksuz bir deger giriniz");
        }else if (email.endsWith("@gmail.com")) {
            System.out.println("Email adresiniz kaydedildi");
        }  else System.out.println("lutfen yazimi kontol edin");


    }
}
