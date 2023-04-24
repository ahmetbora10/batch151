package smalstady.arrays03;

public class C05_arrays {
    public static void main(String[] args) {

        /*
        &.soru Verilen String bir array`de en uzun
        ve en kisa String`leri yazdiran bir method olusturun
         */
        String sehirler []={"KahramanMaraş","Batman","Muş","Van","Kars","Izmir","Çanakkale"};
            enUzunVeEnKisa(sehirler);
    }
public  static  void enUzunVeEnKisa(String[] sehirler){
        String enUzunKelime=sehirler[0];
        String enKisaKelime=sehirler[0];
        for (String w:sehirler ){
            if (w.length()>enUzunKelime.length()){
                enKisaKelime=w;
            }if (w.length()<enKisaKelime.length()){
                enKisaKelime=w;
            }
        }
    System.out.println("en kisa kelime:"+enKisaKelime);
    System.out.println("en uzun kelime:"+enUzunKelime);
}
}
