package smalstady.list03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_list {
    public static void main(String[] args) {
        /*
        Bir dogal sayi listesi olsturun
        ve olusturdugunuz listedeki cift ogeleri toplayiniz
         */
        List<Integer> sayilar=new ArrayList<> (Arrays.asList(12,21,43,16,18));
        System.out.println(sayilar);
        int sum =0;

        for (Integer w:sayilar){
            if (w%2==0){
                sum+=w;
            }
            System.out.println(sum);
        }
    }
}
