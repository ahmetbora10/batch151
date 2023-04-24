package javaders.day31collectionsmaps;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {
   /*
   Map deyince akliniza sozluk gelsin. Sozluklerde sol tarafta kelime, sag tarafta kelimenin anlami olur.
Key ve valueler icin ayri ayri data tipi olur.
HashMap'e baktigimizda birinci yazilan key'in
ikinci yazilan value'nin data tipini gosterir.

HashMapler HashSetler'de oldugu gibi entry'leri rastgele siralar.
Bu yuzden maplerde en hizli HashMap'tir.
Mapler Collection degildir, tamamiyle farkli bir yapidir.
Mapler'de {} kullanilir. Ekrana yazdirdigimizda entryleri {} icinde gorduk.
Setler ise [] kullanir.
Map'lere eklemeyi add methodu ile degil put methodu ile yaptik.

Get() methodu key ile calisir ve value kismini verir. Integer calisir, integer verir.
Ornek getCat() bize Cat'in anlamini verir

keySet() methodu keyler ile alakalidir. Bize bir set verir. Keyler tekrarsizdir,
keyler verilirken Set'in icine konulur. KeySet methodu butun keyleri verir.
Methodun icine girdigimizde methodun return type'i bizim olusturacagimiz
conteynerin data type ile ayni olmasi gerektigi yazili.

Tum valueleri Integer ile aliyoruz. Keyleri alirken String kullandik.

Ortalama nufusu alirken for each loop kullandik ve value.size'i kullandik.
Value.size'a toplami bolduk.

Mapler'de bazen sadece valueler bazen de sadece keyler ile calisabiliriz.

entrySet() methodu entryler'i kalip halinde Set icine koyar. Get() methodu valueler'i Set icine koyar.
Looplar Mapler'de calismaz. Map'in ismini for each loop parantezi icine koydugumuzda uyari verdi.
Bazen Mapler'deki elemanlar arasina girmek, loop ile bakmak isteriz. Tekrarli islerde loop yapmamzi gerekir.
Map'te loop kullanabilmemiz icin entrySet() methodu kullanilir. Aksi halde looplari kullanamayiz.

entrySet() bize Set verir. Her Set'in < > arasina data tipi yazilir. Set;in elemanlarinin data tipi Map'deki
entrylerdir. Entry'lerin keyleri String, valueleri Integerdir.    */
    public static void main(String[] args) {
        HashMap<String,Integer> countryPopulation=new HashMap<>();
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("Albenia", 3000000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Turkey", 83000000);
        countryPopulation.put("Netherland", 18000000);
        System.out.println(countryPopulation);
       int usaPupulations= countryPopulation.get("USA");
        System.out.println(usaPupulations);//400000000
        //Butun "key"leri nasil alabiliriz?
        //keySet() methodu tekrarsiz olan "key"leri bir set'in icine koyarak verir
       Set<String> keys=countryPopulation.keySet();
        System.out.println(keys);//[Netherland, USA, Turkey, Albenia, Germany]
        //Butun "value"lari nasil alabiliriz?
        Collection<Integer> values = countryPopulation.values();
        System.out.println(values);//[18000000, 400000000, 83000000, 3000000, 83000000]
        //Example 1: countryPopulation map'indeki ulkelerin nufuslarinin ortalamasi nedir?
        Collection<Integer> value = countryPopulation.values();
        int sum = 0;
        for (Integer w : values) {
            sum += w;
        }
        System.out.println(sum / values.size());//117400000
        //Elemanlari "enrtry"olan bir "Set" verdi
//Loop'lar map'ler ile kullanilamaz. Sadece entry'ler arasinda gezmek istedigimizde loop kullanabiliriz
        Set<Map.Entry<String,Integer>>entries=countryPopulation.entrySet();
        System.out.println(entries);
        //Example 2-,countryPopulation

    }
}
