package pratices.day06_looparrys;

public class BütçeRunner {

    public static void main(String[] args) {
        Bütçe baba = new Bütçe();//Adem
        System.out.println("Maas öncesi Bütçe" + Bütçe.butce);

        baba.maasAl(30000);
        System.out.println("Maaş sonrası Bütçe" + Bütçe.butce);

        baba.harclikal(100);
        baba.harclıktanharcama(80);
        System.out.println(Bütçe.butce);

        Bütçe anne = new Bütçe();//Havva


        anne.maasAl(50000);

        anne.harclikal(500);
        anne.harclıktanharcama(500);

        System.out.println(Bütçe.butce);
        System.out.println(anne.harclık);

        Bütçe cocuk = new Bütçe();
        cocuk.harclikal(200);
        cocuk.harclıktanharcama(180);
        System.out.println(Bütçe.butce);
        System.out.println(cocuk.harclık);


    }//main
}//class body

