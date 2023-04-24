package pratices.day_15_pratice_inheritance;

public class Surekliisci extends Isci{
    public static void main(String[] args) {


        Surekliisci suric1=new Surekliisci();
        suric1.PersNo=5001;//personel
        suric1.isim="Cem";//personel
        suric1.soyisim="Pireli";//personel
        suric1.statu="Isci";//personel
        suric1.saatucreti=11;//muhasebe
        suric1.maas= suric1.maashesapla();;//muhasebe
        System.out.println(suric1.toString());

    }
}
