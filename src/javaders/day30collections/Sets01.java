package javaders.day30collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets01 {
    /*
    1)Set`ler tekrarsiy eleman(unique) depolamak icin kullanilir-
    2)3 tane Set Class vardir-
    i)HashSet Class
               Benzersiz ID olusturma teknigidir.Bu teknige §Hashing Technique denir.
               "HashSet" elemanlari rastgele siralar.
                "HashSet"  elemanlari siralamadigindan cok hiyli calisir.
                 "HashSet" ler "null"i eleman kabul eder-(icine tekrarsiz oldugundan yalnizca 1 null konulabilir.)

   ii) LinkedHashSet Class:
       "LinkedHashSet "ler elemanlari sizin vediginiz siraya gore dizdikleri nden(insertion order)
       "HashSet"lere gore yavastirlar.
        "LinkedHashSet" ler terarsiz eleman depolamak icindir.
   iii)TreeSet Class:
      "TreeSet" ler elemanlari natural order'a gore dizerler
            "TreeSet" ler elemanlari natural order'a gore dizdiklerinden cooooook yavastirlar
            En yavas set "TreeSet" tir.
     */

    public static void main(String[] args) {
        HashSet<String> hs =new HashSet<>();
        hs.add("Ajda");
        hs.add("Cuneyt");
        hs.add("Esra");
        hs.add("Zeki");
        hs.add("Ezel");
        hs.add("Cuneyt");//Tekrarli eleman eklendiginiyde hata vermey ama tekrarli elemani sadece bir kere ekler-
        hs.add(null);//null en basta zer alir
        System.out.println(hs);//Zeki,Ajda,Cunezt,Esra,Ezel
        System.out.println(hs.hashCode());//2038751948
        LinkedHashSet<Integer> lhs =new LinkedHashSet<>();
        lhs.add(234);
        lhs.add(87);
        lhs.add(-32);
        lhs.add(124);
        System.out.println(lhs);//234.87.-32.124
        LinkedHashSet<Integer> ls =new LinkedHashSet<>();
        ls.add(451);
        ls.add(87);
        ls.add(231);
        ls.add(124);
        System.out.println(ls);//452.87.231.124
        lhs.retainAll(ls);//retainAll:ortak elemanlari korur digerlerini siler
        System.out.println();//Ilk LinkHashSet'teki farkli elemanlar silindi. Yani methodu cagirdigimiz elemanin farkli elemanlarini sildi.

        TreeSet<Character> ts =new TreeSet<>();
        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
        ts.add('R');
        //ts.add(null);==>TreeSet'lere null eklenemez.
        System.out.println(ts);//{A,G,R,U,Z}
        System.out.println(ts.first());//A
        System.out.println(ts.last());//Z
        System.out.println(ts.lower('R'));//G>> Verilen eleman olan R'den bir onceki elemani verir
        System.out.println(ts.higher('K'));// R ==> Verilen K'den sonraki elemanı verir.
        System.out.println(ts.headSet('R'));//[A, G]==> Parantez icindeki R dahil degildir.
        System.out.println(ts.tailSet('G'));//[G, R, U, Z]==> Parantez içinde "G" dahildir.
        System.out.println(ts.headSet('R', true));//[A, G, R]
        System.out.println(ts.tailSet('G', false));//[R, U, Z]==> Parantez icindeki G dagil degildir.
        System.out.println(ts.ceiling('R'));//R==> ELeman set'in içinde varsa elemanın kendisi  return eder.
        System.out.println(ts.ceiling('K'));//R ==> Eleman set'in içinde yoksa Alfabetik sırada sonraki eleman returm eder.
        System.out.println(ts.floor('G'));//G==> Eleman Set'in icinde varsa eleman'in kendisi return eder.
        System.out.println(ts.floor('J'));//G==> Eleman Set'in icinde yoksa onceki elemani return eder.
        System.out.println(ts.subSet('G', 'Z'));//[G, R, U] ==> Ilk parametre dahil ikinci parametre haric.

        System.out.println(ts.subSet('G', false, 'Z', true));//[R, U, Z]









    }
}
