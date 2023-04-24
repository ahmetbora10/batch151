package javaders.day18costructorsstatickeyword;

public class StaticNonStaticBloks02 {
    public StaticNonStaticBloks02() {
        System.out.println("Constructor 1");
    }

    public StaticNonStaticBloks02(int price) {
        System.out.println("Constructor 2");
    }

    public StaticNonStaticBloks02(String name) {
        System.out.println("Constructor 3");
    }

    public StaticNonStaticBloks02(boolean isold) {
        System.out.println("Constructor 4");
    }

    //non-static block constructor'larda calistirilmasi gereken "ortak kod"lari icerir.
    //non-static block icine yazilan kod'lar her constructor icin calistirilir.
    //Bir'den fazla non-static block varsa ustteki once calistirilir.
    {
        System.out.println("I am constructor -ilk");
    }

    {
        System.out.println("I am constructor -ikinci");
    }

    {
        System.out.println("I am constructor -ucuncu");
    }

    public static void main(String[] args) {
       StaticNonStaticBloks02 obj1 = new StaticNonStaticBloks02();
       StaticNonStaticBloks02 obj2 = new StaticNonStaticBloks02(12);
       StaticNonStaticBloks02 obj3 = new StaticNonStaticBloks02("Shirt");
       StaticNonStaticBloks02 obj4 = new StaticNonStaticBloks02(false);
    }
}