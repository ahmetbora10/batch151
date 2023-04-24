package smalstady.scope02;

public class C01_scope {
    /*
    Veriable çeşitleri
    i)instance
    ii)static
    iii)local
     */
    int x= 8;
    static  String isim ="Ali";
    int y;


    public static void main(String[] args) {
        C01_scope obje=new C01_scope();
        obje.y=12;
        System.out.println(obje.x);
        System.out.println(isim);
        System.out.println(obje.y);
        obje.yazdır();
        System.out.println(obje.y);



    }
public  void  yazdır(){

}
}
