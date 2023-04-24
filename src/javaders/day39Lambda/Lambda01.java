package javaders.day39Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    //Lambda collection ve listlerde kullanilabilir fakat map'lerde kullanilamaz
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Tom");
        myList.add("Clara");
        myList.add("Anjelika");

        printElements(myList);//Tom Jim Clara
        System.out.println();
        printEl(myList);//Tom Jim Clara
        System.out.println();
        printElExceptStartsWithT(myList);//Jim Clara
        System.out.println();
        printElLengthLessThanFour(myList);//Tom Jim Tom
        System.out.println();
       printEllenghMoreThanFourWithUper(myList);;//CLARA CLARA ANGELİNA
        System.out.println();
        printEllengMoreThanUniqeLoweCaseU(myList);//clara angelina
        System.out.println();
        printElUniqueToUpperCaseSorted(myList);//ANGELİNA CLARA JİM TOM
        System.out.println();
        printElUniqeLoweCaseSortWithLeng(myList);//tom jim clara angelina


    }

    //Example 1: Bir List'teki elemanlari console'a yazdiran method'u olusturunuz.
    //1. Yol:
    public static void printElements(List<String> myList) {

        for (String w : myList) {         //==>Structured Programming
            System.out.print(w + " ");

        }
    }

    //2. Yol: LAMBDA EXPERESTION
    public static void printEl(List<String> myList) {

        //Functional Programming
        myList.stream().//stream() List'in yapisini yukaridan asagiya olacak sekilde degistirir.
                forEach(t -> System.out.print(t + " "));
    }

    //Example 2: Bir List'teki T ile baslayanlar haric tum elemanlari console'a yazdiran method'u olusturunuz.
    public static void printElExceptStartsWithT(List<String> myList) {

        myList.stream().filter(t -> !t.startsWith("T")).forEach(t -> System.out.print(t + " "));


    }//Ex2

    //Example 3: Bir List'te character sayisi 4 den az olan tum elemanlari console'a yazdiran method'u olusturunuz.
    public static void printElLengthLessThanFour(List<String> myList) {
        myList
                .stream().
                filter(t -> t.length() < 4).
                forEach(t -> System.out.print(t + " "));


    }//Ex3

    //Example 4: Bir List'te character sayisi 4'den fazla olan tum elemanlari buyuk harflerle console'a yazdiran method'u olusturunuz.
    public static void printEllenghMoreThanFourWithUper(List<String> myList) {
        myList.
                stream().
                filter(t -> t.length() > 4)
                .map(t -> t.toUpperCase()).//map() var olan elemani degistirir
                forEach(t -> System.out.print(t + ""));
    }//Ex4
    //Example 5: Bir List'teki character sayisi 4 den cok olan tum elemanlari tekrarsiz olarak kucuk harflerle console'a yazdiran method'u olusturunuz.
    public static void printEllengMoreThanUniqeLoweCaseU(List<String> myList){
        myList.
                stream().
                distinct().//distinct()tekrarli elemanlari bir kere gosterir.
                filter(t->t.length()>4).
                map(t->t.toLowerCase()).
                forEach(t-> System.out.print(t+""));
        //lambda'da elemanlari azaltan methodlar once kullanilir
}
//Example 6: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada console'a yazdiran method'u olusturunuz.
    public static void printElUniqueToUpperCaseSorted(List<String> myList){
        //Burada eleme yapmayacagiz. Her zamanki gibi stream ile baslayalim. Ancak kodumuzu yan yana okunacak sekilde  degil, alt alta siralayalim.
        myList.
                stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted().//Alfabetik siraya gore dizer
                forEach(t->System.out.print(t+""));
    }
    //Example 7: Bir List'teki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarina kucukten buyuge siralayarak console'a yazdiran method'u olusturunuz.
    public  static void printElUniqeLoweCaseSortWithLeng(List<String>myList){
        myList.
                stream().
                distinct().
                map(t->t.toLowerCase()).
                sorted(Comparator.comparing(t->t.length())).// elemanin uzunluguna bakarak karsilastir
                forEach(t-> System.out.print(t+""));
        /*
        Listimizi steram'e cevirdik, filterelemeye gerek yok, tekrarsiz olarak istendiginden distinc methodunu kullandik ve
kucuk harflere cevirmemiz gerektiginden map'den toLowerCase methodunu kullandik. Bizden kucukten buyuge bir
siralama istendiginden sorted methodunu aldik. Bu method icinde karsilastirma yapilmasi icin Comparator.comparing yazdik. Boylece uzunluklara gore siralama olacak. sorted(Comparator.comparing(t->t.length)
Siralamayi biz yapacaksak Comparator.comparing kullanmaliyiz.
Methodu main method icinde cagirdik ve ekranda tom iki kez olmasina ragmen bir kez yazildi ve length'i en kisa olanlarin basa alindigini, tum elemanlarin kucuk harfle yazildigini gorduk.
         */
    }

}