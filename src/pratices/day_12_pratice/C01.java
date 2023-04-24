package pratices.day_12_pratice;
public class C01 {
    /*
 1)   Instant veriable clas seviyesinde olusturulur.
 2)Static degilse main method icersinde lasabilmek icin obje olusturulur.
 3)obje olusturmak icin  class adini kullaniriz.
 4)Parametreli bir obje olusturmussak parametreli bir constractir olurmak gerekir.
 5)Constractir adi ile obje adinin ayni olmasi lazim
 6)constractir daki ismi instant veriable esayn etmek icin ikisinin adi ayni oldugu icin this degerini kullaniriz,
 7)Kod okumaya main methoddan baslariz.
     */
    //Bu class calistiginda output ne olur. Calisma mantigini anlatiniz
    String isim="Hasim";
    int yas =20;
    public C01(String isim, int yas) {
    this.isim=isim;
   this.yas=yas;
    }
   public C01() {
    }
    public static void main(String[] args) {
        C01 obje1 =new C01( "Nuri" ,25);
        System.out.println(obje1.isim+","+obje1.yas);
        C01 obj2 =new C01();
        System.out.println(obj2.isim+","+obj2.yas);
   }
}
