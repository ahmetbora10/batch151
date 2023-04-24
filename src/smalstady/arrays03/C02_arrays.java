package smalstady.arrays03;

import java.util.Arrays;

public class C02_arrays {
    public static void main(String[] args) {

        /*
        2.soru bir array olusturun ve olustudugunuz sayilari kucukten buyuge siralayin
         */
        int sayilar[]={3,5,7,11,9};
        System.out.println(Arrays.toString(sayilar));
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));
        int sum []={1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(sum));
    }
}
