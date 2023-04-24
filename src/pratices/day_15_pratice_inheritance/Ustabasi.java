package pratices.day_15_pratice_inheritance;

public class Ustabasi extends Isci{

    @Override
    public String toString() {
        return "Ustabasi{" +
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

    public static void main(String[] args) {
        Ustabasi ustabasi1=new Ustabasi();
        ustabasi1.isim="Murat";
        ustabasi1.soyisim="Golkce";
        ustabasi1.saatucreti=15;
        ustabasi1.maas= ustabasi1.maashesapla();
        ustabasi1.statu="Isci";
        ustabasi1.iscisattu="Ustabasi";
        System.out.println(ustabasi1.isim);
        System.out.println(ustabasi1.soyisim);
        System.out.println(ustabasi1.toString());
       ustabasi1.mesai();//Isciler gunluk 8 saat ve haftada 5 gun calisir.

    }

}
