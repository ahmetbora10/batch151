package javaders.day24inheritancepolymorphism;
//Inheritance'de ortak özellikler  parant'e yazılır.
/*
        1)Inheritance'da object olustururken constructor'lar yukaridan(Parent)
          asagiya(Child) dogru calisir.
        2)Parent ve Super es anlamlidir, Child ve Sub es anlamlidir.
        3)super() her constructor'in ilk satirinda gorunmez olarak bulunur.
          Isterseniz gorunur sekilde de yazabilirsiniz.
        4)super() sizi parent class'daki constructor'a tasir.
        5)this() sizi ayni class icindeki constructor'lar arasinda gezdirir.
        6)"this" icinde bulundugunuz class'daki variable'lari cagirmaya yarar.
          "super" parent class'daki variable'lari cagirmaya yarar.
        7]Parent ten Child a HAS-A ilişkisi var. yukarıdan aşağıya yani.
//Animal-Mammal-Cat-Van Cat
//Animal has a cat, mammal a van cat, cat has a van cat
//Child dan parent a IS-A ilişkisi vardır.
Cat is a animal, van cat is a mammal, mammal is a animal,
eğer data tipleri arasında IS-A ve HAS-A ilişkisi varsa bu data tiplerine COVARIA NT denir.
     */
/* OOP'nin dort prensibi var.
 * 1) Inheritence.
 * 2) Polymorphismi
 * i) OverLoading
 * ii) Overridin
*/

/*
    1)Polymorphism ==> Coklu sekil
      Yani bir method'un farkli sekillerde karsimiza cikmasi demektir.
      Polymorphism = Overloading(+) + Overriding(-)
    2)Overriding, parent class'daki method'u child class'in ihtiyaclarina gore ozellestirerek kullanmak demektir.
    3)Overriding'de method'un body'si degistirilir.
    4)Overriding'de method signature'a dokunulmaz. Dokunursaniz Java kizar.
 */
public class Car {

    public void move() {
        System.out.println("Cars move...");
    }

    public void getbreak() {
        System.out.println("Cars berak...");
    }

    public void engine() {
        System.out.println("Cars have engine...");
    }

    public String model = "Car";
    public int price = 0;

    public Car() {
        System.out.println("Car constructor 1");//Constructur'da reten typ olmaz.

    }

    public Car(int i) {
        this();
        System.out.println("Car constructor 2");
    }
}
