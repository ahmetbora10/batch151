package javaders.day13loops;

public class Loops01{
    public static void main(String[] args) {

//21 den 180 e kadar hem 4 hem de 6 ile bolunebilen tamsayilari console'a yazdiran kodu yaziniz
        for(int i=21;  i<81;  i++ ) {

            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print(i + " ");

            }
        }
//Size verilen kucuk harfle yazilmis String'in indexi cift sayi olan character'lerini buyuk harfe donusturunuz
//miami

String s ="miami";

        for(int i=0; i<5; i++ ){

            String ch =s.substring(i, i+1);
            if(i%2==0){
                System.out.print(ch.toUpperCase());
            }else{
                System.out.print(ch);
            }
        }
        //Verilen bir string'de ilk 'a' harfinden onceki tum characterleri console'a yazdiriniz
        //Hello Java


        String t ="Hello Java";

        for (int  i=0; i<t.length(); i++ ){
            char ch =t.charAt(i);

            if(ch=='a') {
                break;
            }else{
                System.out.print(ch);
            }
        }
//verilen bir string de son 'a' dan sonraki tum characterleri ters sirada yazdiriniz
//tokatci
        String u="tokatci";

        for (int i=u.length()-1; i>=0; i--){
            char ch =u.charAt(i);

            if(ch=='a'){
                break;
            }else{
                System.out.print(ch);
            }
        }


        }


}
