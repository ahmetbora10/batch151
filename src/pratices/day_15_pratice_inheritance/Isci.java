package pratices.day_15_pratice_inheritance;

public class Isci extends Muhasebe{
    /*
    Bu class`danda obje olusturabiliriz. Bu class`in child class`larinin olmasi obje olusturmaya engel degil.
   fakat isciler icin.surekli ve ustsbasi olmaktan baska intimal olmadigindan isci classinda isci uretmeye gerek yok.
     */
    protected  String iscisattu="Surekli isci";

    @Override
    public String toString() {
        return "Isci{" +
                "iscisattu='" + iscisattu + '\'' +
                ", saatucreti=" + saatucreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", PersNo=" + PersNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    protected void mesai(){
        System.out.println("Isciler gunluk 8 saat  ve haftada 5 gun calisir ");
    }
}
