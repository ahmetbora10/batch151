package javaders.day26abstraction;

//Body'si olmayan method'a abstract(vucutsuz-soyut) method denir.
    /*
    1)Bazen parent class'daki methodun body'si hiçbir method tarafındsan kullanılmaz.
    Bu durumda parrent'deki method''a body yazmak hiç kullanılmadığı için mantıklı değildir.
     Bizde o merthodo body yazmayız.
     2)Body'si yazilmayan method'a "Abstract Method" denir.
          Abstract Ingilizce'de "vucutsuz" veya "soyut" anlamindadir.
        3)Method'un body'sini yazmayinca Java hata verir, biz de "abstract"
          keyword'unu kullanarak Java'ya bu emthod'un body'si olmayacak deriz.
        4)"abstract" keyword'unu kullaninca elde ettigimiz abstract method
          normal class'lara konulamaz, o yuzden class'i da "abstract" yapariz.
          5)Parent'daki method abstract ise bütün child class'ler o method'u override etmek zorundadır.
          Bu yüzden tüm child'ler için mecburi olmasını istdeğiniz fonksiyonları abstract yazmak analitikli bir seçimdir.
          6)Body'si olan method'lar (Concrete Method) abbstract class'ların içine yazılabilir.
          abstract methot'lar concrete class'ların içine yazılamaz.
          7) Abstract keyword ile "method" body bir method'da ayni anda kullanilmaz.
   8) abstract class'ların içinde "abstract method"lar olur. " abstract method"lar body'si
   olmadıgından "eksik method"lar gibi düşünülebilir.
   yani abstract class içinde eksik bir yapı barındırır, siz abstract class'dan
   object uretirseniz abstract class içindeki eksiklik object'e yansir ve object eksigi olan
   bir object olmuş olur.
   Java bunu istemez cunku eksik object is yapar, bu da application'in yanlış calısmasına sebeb olur
   Java application'i korumak için "abstract class"lardan object uretilmesini engellemiştir.
   9)"abstract class"larin constructor'i vardir ama object oluşturamazlar.
   10) final() methodlar abstract olamazlar, concrete olmalidir.
   11)Private methodlar abstract olamaz.
   12) "abstract class"ın child class'ı "Concrete" veya "Abstract" olabilir.


         */
/*
    " "final keyword'u Aciklar misiniz?
 1- "final keyword"==> Variable'larda  kullanilir.
   A-Variable'lerde kullaildiginde kesinlikle deger atamasi yapilmalidir.
   B- Ilk atanan deger degistirilemez.

 2- "final keyword"==> Method'larda kullanilir
   A- O method'un body'si degistirilemez.
   B- o method Override edilemez.

 3- "final keyword"==> Class'larda kullanilir
   A- O class'in child class'i olamaz. Ama final class'in kendisi child olabilir.

 */
public abstract class Courses {
    public abstract void math() ;
    public void art(){
        System.out.println("Learn art");


    }

}
