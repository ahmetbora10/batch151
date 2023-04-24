package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternar01 {

    /*
    Kullanicidan alinan iki sayidan kucuk olani ekrana yazdiriniz
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two integrel... ");
        int first  = input.nextInt();
        int second = input.nextInt();


        //*******1.YOL: Use If else*************//
        if(first<second){ System.out.println(first);} else{System.out.println(second);}

        //*******2.YOL: Use Ternary************//
        int result= first<second ? first : second ;






    }
}
