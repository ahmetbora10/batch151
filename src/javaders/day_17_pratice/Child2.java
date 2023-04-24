package javaders.day_17_pratice;

public class Child2 extends Parent2 {
/*
Exdens yapilan classlardaki tum constructorlarin ilk satirinda biz gormesek bile
super() constructor coll vardir.
Dolayisiyla once parent class`daki constructor calisir.
 */
    public  Child2(){
        super();
        System.out.println("child class parametrrsiz constructor");
    }
    public Child2(int i) {
        super();//classlariniz arasinda Parent Child iliskisi varsa super cikar
        System.out.println("child class tek parametreli constructor");
    }
public  Child2(int a,int b){
        super();
    System.out.println("Child class iki parametreli constructor");
}
    //Parent2 isiminde bir class olusturunuz
    //Child2 classi Parents 2 class`a extends  ediniz.
    // Child2 class`da parametresiz,tek parametreli ve iki parametreli obje olusturunuz.
    // super() constructor`u kullanarak Parent2`den ekran ciktisi aliniz.
    public static void main(String[] args) {

    Child2 obj1=new Child2();
    Child2 obj2=new Child2(1);
    Child2 obj3= new Child2(1,2);





    }
}
