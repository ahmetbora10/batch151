package smalstady.arrays03;

import java.util.Arrays;

public class C03_arrays {
    public static void main(String[] args) {
        /*
        3.soru verilen arrayin  tum elemanlarini bir sonraki konuma tasiyacak
        bir program yaziniz
 ise outut(2,3,4,5,1) olacak
          */
        int sayilar[]={1,23,4,5};
        int temp=sayilar[0];
        for (int i =0;i<sayilar.length-1;i++){
            sayilar[i]=sayilar[i+1];
            System.out.println(Arrays.toString(sayilar));
        }
        sayilar[sayilar.length-1]=temp;
        System.out.println(Arrays.toString(sayilar));
    }
}
