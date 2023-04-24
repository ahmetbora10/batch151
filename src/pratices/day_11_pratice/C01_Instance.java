package pratices.day_11_pratice;

public class C01_Instance {
    int sayi;//0
    //Instent veraible icin sayi atamak zorunda degiliz


    String isim;//null

    boolean ogrenciiMi;//false


    public static void main(String[] args) {


 /*

 sayi, isim, ogrenciMi seklinde dort tane instance variable olusturalım.
 Bu instance variable'lerin default degerlerini main icerisinde yazdıralım

*/
C01_Instance obj1 =new C01_Instance();
        System.out.println(obj1.sayi);//0
        System.out.println(obj1.isim);//null
        System.out.println(obj1.ogrenciiMi);//false
        //////////////////////////////////////

        C01_Instance obj2=new C01_Instance();

        obj1.isim="Hasan";
        obj2.isim="Huseyin";

        obj1.sayi=20;
        obj2.sayi=25;
        System.out.println(obj2.sayi);//25
        System.out.println(obj1.sayi);//20


    }
}
