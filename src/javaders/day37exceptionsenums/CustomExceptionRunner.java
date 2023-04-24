package javaders.day37exceptionsenums;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomExceptionRunner {
    /*
  1)  "try" kullandigimizda her senaryo icin calismasini istedigimiz kodlari "final block" icine koyariz.
  2)"final","finally"ve "finalize" aciklar misiniz?

     */

    public static void main(String[] args) throws IllegalGradeException {

   //  System.out.println(getGrades());
        try{
            printAge(-45);
        }catch (IllegalAgeException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("I always work");
        }

            }
            //Example 1: Ogrenci notlarini bir List'e ekleyen methodu olusturunuz

            public static List<Integer> getGrades() throws IllegalGradeException {

            List<Integer> grades = new ArrayList<>();


             Scanner input = new Scanner(System.in);
             System.out.println("To stop entering press q");
             char ch = input.next().charAt(0);

                do {
                    System.out.println("Please enter the grade.");
                    Integer grade = input.nextInt();

                    if (grade >= 0 && grade <= 100) {
                        grades.add(grade);
                    } else {
                        throw new IllegalGradeException("Grades less than zero and greater than 100 are not valid.");
                    }
                } while (ch != 'q');

                return grades;
            }
    //Example 2: Kullanicinin yasini console'a yazdiran method'u olusturunuz.
    public static void printAge(int age){

        if(age<0){
            throw new IllegalAgeException("Ages cannot be negative");
        }
        System.out.println(age);

    }


}

        /*
  do{} icinde enter the grade mesajimizi kullanicidan integer degil de String alacak sekilde yaptik. Listlerimizi
String yaptik. Boyle olunca if statement icini String'e uygun bir sekle cevirmemiz gerekti. Integer
Wrapperclassina giderek valueOf () methodunu aldik ve grade'i Integer'a cevirmis olduk. Bu durumda if(intGrade>=)
&& intGrade<=100) olmasi sorun olmayacak. Kullanicinin girdigi 'q' degilse loop devam edecek.
 Do icindeki String grade="";'in kizardigini gorunce orada bir scope hatasi oldugunu anlayarak, String'imizi do loop'unun
disina cikardik. Problemle karsilasinca cozmeye calisiriz.
Baska bir problem olustu. If icinde intGrade'ler kizardi.
Yine scope problemi oldugunu anlayarak int intGrade=0;'a cevirerek scope disina cikardik.
Kodu calistirinca sirasiyla sayilar girdik.'q'ya varincaya kadar devam etti.
 'q'ya baisnca list icine 'q'yu dahil etti. Bunu engellemek icin kodumuzu gelistirdik.
  ilk if'imizi else kismina yerlestirdik. Ilk if icine !grade.equals("q")'yu yazdik.
Bu sayede 'q'ya basinca onceki sayilari liste ekledi ancak artik 'q'yu listte gormedik.
         */