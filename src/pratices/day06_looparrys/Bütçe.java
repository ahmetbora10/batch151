package pratices.day06_looparrys;

import java.util.Scanner;

public class Bütçe {
 // Tum aile uyelerinin birikiminin
// bulundugu ortak ihtiyaclar icin
// kullanildigi bir butce ile kisisel
// harcamalarin yapildigi
// harclik'larin oldugu basit bir ev bütçesi kodu yazınız.

   public  static int butce;
   public int harclık;

   public void maasAl(int alınanMaas){

       butce+=alınanMaas;//butce+alınanMaas;şeklinde de yazılabilir.ama (butce+=alınanmaas daha profösyönelcedir.)


   }//maas

public  void harclikal(int alinanHarclik){
       butce-=alinanHarclik;//Ortakhesaptan Harclık Alınır
    harclık+=alinanHarclik;

}//harclık

    public void butcedenharcama(int harcanacakPara){

       butce-=harcanacakPara;
    }//harcama
public void harclıktanharcama(int harclıkHarcaması){
    harclık -=harclıkHarcaması;
}










}//Class

