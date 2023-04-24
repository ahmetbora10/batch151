package smalstady.list03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
Listè 3 yolla eleman eklenebilir
1)add methodu ile teker teker.
2)list olusturduktan sonra mew keybbordunun arkasinda
sonra ArrayListìn konstartirina Arraylists.asList ile eleman
eklenebilir.

 */
public class C01_list {
    public static void main(String[] args) {
        /*
        Soru 1) bir list olusturup eleman ekleyin ve yazdirin
         */
        List<Integer> myList = new ArrayList<>();
        myList.add(11);
        myList.add(22);
        myList.add(24);
        myList.add(92);
        System.out.println(myList);//{11,22,24,92}
        myList.add(1, 15);//1.indexdeki 22 rakamini 15  ile degistirdi.
        System.out.println(myList);//{11,15,22,24,92}
        myList.set(2, 10);//2. elementi 10 ile degistirdi.
        System.out.println(myList);//{11,15,10,24,92}
        List<Integer> byList = new ArrayList<>(Arrays.asList(1, 3, 5, 9));
        System.out.println(byList);


        }
    }

