package introduction.day03scanner;

import java.util.Scanner;
public class Scanner04 {
    public static void main(String[] args) {

        //Kulanici`dan iki sayi alip dort islem yapan ve islemlerin sonuclarini ekrana yazdiran kod yaziniz
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen iki sayi giriniz...");

        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();
        System.out.println((firstNumber+secondNumber));
        System.out.println(firstNumber-secondNumber);
        System.out.println(firstNumber*secondNumber);
        System.out.println(firstNumber/secondNumber);
        System.out.println((firstNumber+secondNumber) +

                "\n"+(firstNumber-secondNumber));



    }

}

