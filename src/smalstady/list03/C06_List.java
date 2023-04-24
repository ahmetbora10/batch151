package smalstady.list03;

import java.util.ArrayList;
import java.util.List;

public class C06_List {
    public static void main(String[] args) {
        // bir listede ortalamanin ustunde olan element sayisini bulun
        //1.once Integer bir list  olusturulur
      //  2.list elemanlarinin ortalamasi alinir
        //Ortalamanin uzerindeki sayilar alinir.
        List<Integer> sayilar=List.of(5,10,15,25,40);
        double sum=0;
        double ort =0;
        int counter=0;//counter=sayac kactane sayi oldugunu tesbit ediyoruz.

        for (Integer w:sayilar){
            sum+=w;   //Ortalama icin once toplami bulduk.
        }
ort=sum/sayilar.size();//Ortalamayi bulmak icin sayi toplamini yani sum``i  sayi uzunluguna bolduk.
        for (Integer w:sayilar){
            if (w>ort){
                System.out.println(w);
                counter++;

            }
            System.out.println("ortalamadan buyuk sayi sayisi="+w);
        }
    }
}
