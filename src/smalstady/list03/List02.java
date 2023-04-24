package smalstady.list03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class List02 {
    /*
    Bir list olusturun ve aalfabetik suraya gore siralayin
     */
    public static void main(String[] args) {


List<String>Sehirler=new ArrayList<>();
Sehirler.add("Mersin");
Sehirler.add("Balikesir");
Sehirler.add("Aydin");
Sehirler.add("Konya");
 System.out.println(Sehirler);//{Mersin,Balikesr,Aydin,Konya}
  Collections.sort(Sehirler);
        System.out.println(Sehirler);


    }
}
