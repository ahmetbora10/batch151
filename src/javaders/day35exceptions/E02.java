package javaders.day35exceptions;

public class E02 {
    public static void main(String[] args) {
        System.out.println(getCharFromString("Java", 2));//A
        System.out.println(getCharFromString("Java", 8));


    }//main


    //Example 1: Bir String``deki characterì index kullanarak alan bir method olusturunuz.
    public  static  char getCharFromString(String str, int idx){
        try {
            return  str.charAt(idx);
        }catch (StringIndexOutOfBoundsException e){//StringIndexOutOfBoundsException Stringlerde olmayan index kullanildiginda atilir
          idx =  Math.abs(idx);
          idx=  idx%str.length();//Stringi lengthè bolecek kalani verecek

            return str.charAt(idx);
        }


    }//method body

}//class body
