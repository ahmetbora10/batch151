package smalstady.list03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C07_List {
    /*
       icinde 200 tane 1000'den kucuk pozitif tamsayi
       olan bir list olusturun kullanicidan bir sayi
        isteyip  listede var olup olmadigini kullaniciya yazin
       */
    public static void main(String[] args) {

        Random  randomsayi=new Random();//Rastgele istedigimiz aralikta istedigimiz kadatr sayi olusturur.
        List<Integer> sayilistesi=new ArrayList<>();
        int sayi =0;
        while (sayilistesi.size()<200){
            sayi= randomsayi.nextInt(1000);
            if (!sayilistesi.contains(sayi)){
                sayilistesi.add(sayi);
            }

        }
        System.out.println(sayilistesi);
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen aramak istediginiz sayiyi giriniz...");
        int sayi2= scan.nextInt();
        System.out.println(sayi);
        if (sayilistesi.contains(sayi2)){
            System.out.println("Girdiginiz sayi mevcut");
        }else{
            System.out.println("Girdiginiz sayi bulunmamaktadir....");
        }


    }
}
