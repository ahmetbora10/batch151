package smalstady.list03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
1)once integer bir list olusturduk
2)bizden tekrarsiz bir list istendiginden
tekrarsiz list icin method yazildi
3)for i kullanildi

 */
public class C05_List {
    public static void main(String[] args) {
        // verilen bir listede tekrar eden sayilari sadece 1 tane yapan
        // bir method olusturun
        // orn : [1, 5, 3, 5, 6, 1, 7]  bu listi
        //       [1, 3, 5, 6, 7] bu hale donusturun
        List<Integer> sayilar = new ArrayList<>(Arrays.asList(1, 5, 3, 5, 1, 6, 7));
        System.out.println(sayilar);
      tekrarsizListOlustur(sayilar);


    }
    public static void tekrarsizListOlustur(List<Integer> sayilar){
        List<Integer> tekrarsizlist=new ArrayList<>();
        for ( int i=0 ;i<sayilar.size(); i++){//sayilarin uzunlugu size ile alinir
            if(!tekrarsizlist.contains(sayilar.get(i))){
                tekrarsizlist.add(sayilar.get(i));
            }
            System.out.println(tekrarsizlist);
        }
    }

}