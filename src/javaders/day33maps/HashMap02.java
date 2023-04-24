package javaders.day33maps;

import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {

    //Hashmap arkasinda calisan mekanizma nasil calisir?
        //Java Hashing Tecnic kullanarak herbir "entry" icin "HashCode" uretir ve bu kodu 16'ya boler.
        //Bucket'a gider, kalan sayi'nin bulundugu index'e gider ve sirayla "HashCode", "key" ve "value" u koyar.
        //Java Bucket`larin icinde LikesdList kullanir.
    HashMap<String,String> capitals =new HashMap<>();
    capitals.put("USA","Washington");

    capitals.put("Italy","Roma");

    capitals.put("Turkite","Ankara");


}
}
