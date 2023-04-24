package javaders.day34exceptions;

public class E01 {
    /*
    1)"Exception" beklenmedik problem demektir.
    2)"Exception"i halledebilmek icin iki temel yol vardir;
    i)"Exception"a uygun cozumler uretbilirsiniz. Buna "Exception Handling" denir.
    ii)"Exception " olustugunda bunu ilan eder ve gri cekilirsiniz.buna da "Throw Exception" denir.
    iii)"Exception" a uyugun cozumler uretmede "try-cath" kullanilir.
    "try block" da yapilmasi gereken islemi Java`dan yapmasini istenir.
    Java islemi problemsiz bir sekilde yaparsa "catch blok" java tarafindan okunmaz.
    "try block" da islem yapilirken "Exception" olusursa "catch block" devreye girer ve "catch block" icindeki kodlar calisir.
    iiii)"try block" da islem yapilirken "Exception" olusursa "try block" icindeki Exception'dan sonraki kodlar calistirilmaz.



     */
    public static void main(String[] args) {
        System.out.println(divide1(12, 3));
        ;
        System.out.println(divide1(6, 0));

    }

    //1.Way: Exceptionì handle etmede ilk yol
    public static int divide1(int a, int b) {
        if (b == 0) {
            return 0;
        } else {
            return a / b;
        }
    }

    //2.Way  Exceptionì handle etmede harika bir  yol
    public static int divide2(int a, int b) {
        int result = 0;
        try {
            result = a / b;
            System.out.println("I am here");
        } catch (ArithmeticException e) {
            System.out.println("do not divide any number by zero");
        }
        return  result;
    }
}