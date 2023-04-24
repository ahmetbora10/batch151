
package javaders.day29collections;

import java.util.LinkedList;

public class LikendList01 {
    public static void main(String[] args) {

        LinkedList<String > s =new LinkedList<>();
        s.add("Steve");
        s.add("Ajda");
        s.add("Muge");
        s.add("Cüneyt");
        s.add("Esra");
        s.add(2,"Esen");
        s.addFirst("Kemal");
        s.addLast("Ajdar");
        System.out.println(s);//[Kemal, Steve, Ajda, Esen, Muge, Cuneyt, Esra, Ajdar]
        //s.remove(2);//Ajda
        System.out.println(s);//[Kemal, Steve, Esen, Muge, Cuneyt, Esra, Ajdar]

// s.remove("Ajdar");
        System.out.println(s);//[Kemal, Steve, Esen, Muge, Cuneyt, Esra]

        //s.remove();
        System.out.println(s);//[Steve, Esen, Muge, Cuneyt, Esra]

        //s.removeFirstOccurrence("Esra");
        System.out.println(s);//[Esen, Ajda, Muge, Cuneyt, Esra]

        s.removeLastOccurrence("Esra");
        System.out.println(s);//[Kemal, Esra, Steve, Esen, Ajda, Muge, Cuneyt, Ajdar]

        /*
ArrayList'ler eleman silme ve eklemede  tekrar indexlemee yapmak zorunda olduklarindan
 eleman ekleme ve silmede basarisizdirlar.
 *NOTE:LinkedList' de eleman yerine "node" var denir.
 */
        /*
        ArrayListler eleman silme ve eklemede yavastirlar. Cunku tekrar indexlemeye ihtiyac duyarlar.
LinkedListler ise elaman silmede basarilidirlar. LinkedListlerde her eleman bir sonrakini gosteriyor
ve en sondakinin sonrasi olmasa da null gosterir. LinkedListeler index kullanmazlar.

LinkedListlerde en bastaki elemandan daha once Head eleman vardir. Son eleman'a Tail denir en sonda
oldugu icin. Elemanlarin yapisi farkli olup bunlara Node denir. Yapinin bir yuzune point, on yuzune
ornegimize gore harf olan kismina Data denir. Node, Data ve Point'den olusuyor.
Bir eleman sildigimizde eleman sildik demiyoruz, node sildigimizi soyluyoruz.
         */
        //peek() methodu ilk elemani size getirir fakat silmez ==> Copy-Paste gibi
        //Note:peek() ile element() ikisi de ilk elemani silmedene size verir
     //   Ama peek() list bos oldugunda size null verir, element() ise "hata" verir
     /*   Set tekrarsiz elemanlar ornegin email adresleri, tel no, kimlik nolarini depolamak icin Set kullanilir.
                HashSet ve devami ne zaman kullanilir.
                HashSet setlerin en hizlisi olup hiz ihtiyaci olunca bunu kullanin
        LinkedHashSet elemanlarin girilen siraya gore dizilmesi icin kullanilir.
        TreeSet elemanlari natural order'a gore dizmek icin kullanilir*/
    }

}
