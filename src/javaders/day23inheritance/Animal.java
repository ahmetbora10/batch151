package javaders.day23inheritance;

public class Animal {
    /*
    1)eat() method'u gibi birçk class'ın kullanması gereken methodu her class'a ayrı ayrı yazarsak;
    i)Tekrara yapmış oluruz,tekrar ideal code'de olmamalıdır.
    ii)Aynı method'u tekrar tekrar yazmak zaman kaybıdır.
    iii)tekrar tekrar yazılan method'un tamiri çok zaman alır.
    iv)tekrar tekrar yazılan method'un tamiri çok zaman alır.
    v)Method'u tekrar tekrar yazmak "atomic yapıya" terstir.
    2)Private class member'lar child class'lar tarafından kullanılamaz.
      Public class'lar child class'lar tarafından kullanılabilir.
      Defaut class member'ler aynı pakgace'de child claslar tarfından kullanılabilir.
      Protected class'lar farklı packge'de olsa  childclass'lar tarasfından kullanılabilir.
      3)Java'da bir class'ın sadece 1 tane prant'i olabilir.
      Çoklu Parents'e "Multi Inharitance" derler. Tekli parent'e "Sşngle Inharitance"derler.
      Java "Multi Inharitance'i " desteklemez.Java "Single İnharitance" kullanılır.
     */
 void eat(){
        System.out.println("Animal eat...");

    }
    public void drink(){
        System.out.println("");
    }
}
