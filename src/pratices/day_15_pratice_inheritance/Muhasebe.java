package pratices.day_15_pratice_inheritance;

public class Muhasebe  extends Personel{

    protected  int saatucreti;
    protected String statu;
    protected  int maas;
    protected  int  maashesapla(){
      int maas=  saatucreti*8*30;
              return  maas;
    }
}
