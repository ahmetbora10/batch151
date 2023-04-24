package javaders.day35exceptions;

public class E01 {
    //Exception istinai durum demektir. Kodun normal calismasini degistiren durumdur.
    //Exception Class'lar application'in hatasiz olarak calismasi icindir
    //"Exceptions"lar labirentin duvarlari seklinde dusunulebilir. Labirentin duvarlari bizi belli yerlere yonlendirir. O duvarlari gecemeyiz.Java daki "Exceptions"da boyledir.
//"Exceptions" duvarlar orerek developerleri hata yapmasini onluyor. "Exceptions"lar bizim kontrol mekaniyzmamiz gibidir.
    public static void main(String[] args) {
        System.out.println(covertStringToInt("123" +2)); // 125
        // yazdigimiz kodun sayiya cevirilip cevrilmedigini bukmak icin toplama islemi yapariz.
        System.out.println(covertStringToInt("12ab" +2));//"NumberFormatException" hatasi veriyor. Java diyor ki girdigin string sayi formatinda degil diyor.
    }//main
        // Bir Stringì Integerè ceviren method olusturunuz.

        public static int covertStringToInt(String str) {

            try {
                return Integer.valueOf(str);
            } catch (
                    NumberFormatException e) {//Stringlerde stringi hatirlatsin diye str kullandigimiz gibi  "Exception"da e  kullaniriz.

                str = str.replaceAll("[^0-9]", "");  //Rakamdan farkli olanlari replaceAll ile sileriz.
                return Integer.valueOf(str);
/*
valueOf(str) methodu String'i integer'a cevirir. "123" olan String'i java sayi gibi gordu ve istedigimiz
sekilde toplama islemi yapti. ValueOf nethodunu sayi formatinda olmayan bir String ile kullanirsak exception
aliriz. NumberFormatException aliriz.
 */

            }
        }
}

