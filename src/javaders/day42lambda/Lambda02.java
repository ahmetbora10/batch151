package javaders.day42lambda;

import javaders.day41_lambda.Utils;

import java.util.stream.IntStream;


public class Lambda02 {
    public static void main(String[] args) {


        System.out.println(getSumInTheGivenRange(10, 7));
        System.out.println(getMultiplicationInTheGivenRange(7,10));
        System.out.println(getSumOfDigitsInTheGivenRange(45,47));

    }

    //Swap icin bir tane private method olustur
    private static void swap(int starting, int ending){

        if (starting>ending){
            starting=starting + ending;
            ending=starting - ending;
            starting = starting - ending;
        }

    }
    //Example 1: 7'den 10'a kadar tamsayilarin toplamini hesaplayan method'u olusturunuz.
    public static int getSumInTheGivenRange(int starting, int ending) {
        swap(starting,ending);
        return IntStream.rangeClosed(starting, ending).sum();

    }
    //Example 2: 7'den 10'a kadar tamsayilarin carpimini hesaplayan method'u olusturunuz.

    public static int getMultiplicationInTheGivenRange(int starting, int ending) {
        swap(starting,ending);
        return IntStream.rangeClosed(starting, ending).reduce(Math::multiplyExact).getAsInt();

        //rangeClosed() methodu ilk sayi buyuk oldugunda calismaz
    }

    //Example 3: 45'den 47'ye kadar tamsayilarin rakamlari toplamini hesaplayan method'u olusturunuz.
    //           45 46 47 == ?   4+5+4+6+4+7  = 30
    public static int getSumOfDigitsInTheGivenRange(int starting, int ending) {
        swap(starting,ending);
        return IntStream.rangeClosed(starting,ending).map(Utils::getSumOfDigits).sum();

    }

}