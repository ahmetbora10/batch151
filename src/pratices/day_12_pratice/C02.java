package pratices.day_12_pratice;

public class C02 {
    //Bu class calistiginda output ne olur. Calisma mantigini anlatiniz
    String isim;
    int yas;
    String telefon;
//Stringlerin default degeri null`dir.
    //char defaukt degeri hicliktir.
    public C02(String isim,int yas,String telefon) {

this.isim=isim;
this.yas=yas;
this.telefon=telefon;
    }

    public static void main(String[] args) {
        C02 obj1 =new C02("Burak",32,"0246");
        System.out.println(obj1.isim+"," +obj1.yas+"." +obj1.telefon);


    }
}
