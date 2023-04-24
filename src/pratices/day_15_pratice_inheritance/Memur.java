package pratices.day_15_pratice_inheritance;



public class Memur extends Muhasebe {
    @Override
    public String toString() {
        return "Memur{" +
                "saatucreti=" + saatucreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", PersNo=" + PersNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public static void main(String[] args) {


    Memur memur1=new Memur();
    /*
    memur1 objesi,memur clasinin objesi olmasina ragmen
    inherit ettigi muhasebe ve onunda parrent`i olan persinel
    classindakintum datalari alabilir.
     */
memur1.PersNo=1001;
memur1.isim="Ahmed";
memur1.soyisim="Tepe";
memur1.adres="Ankara";
memur1.tel="3456789";
//Muhasebe
memur1.saatucreti=10;
memur1.statu="Memur";
memur1.maas=memur1.maashesapla();
        System.out.println(memur1.PersNo);
        System.out.println(memur1.maas);
///////////
        Memur memur2=new Memur();
        memur2.PersNo=1002;//personel
        memur2.saatucreti=10;//muhasebe
        System.out.println(memur1.toString());//toplu  veri yazdirmak icin toString() methodu pratik bir yontemdir.(sag tik generalden tostring secilir.
        memur2.maas=memur2.maashesapla();//muhasebe
        System.out.println(memur2.toString());
        System.out.println(memur2.PersNo);//1002
        System.out.println(memur2.maas);


    }
}
