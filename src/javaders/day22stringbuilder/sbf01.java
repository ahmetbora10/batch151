package javaders.day22stringbuilder;

public class sbf01 {
/*
1)StringBuffer Java'da String üretilen bir Class'dir.
2)StringBuffer,StringBuilder'e çok benzer,yani ikisi de "mutable" String üretir.
3)StringBuffer"multi-thread"dir ama StringBuilder "multi-thread"değildir.
4)Java StringBuffer'i,StringBuilder'den önce oluşturdu.
5)StringBuilder "multi-thread" olmadığı için StringBuffer'dan daha hızlı çalışır.
6)"multi-thread" yapilirken yapilan islerin siralamasi onem arzeder, yapilan isleri
          mantikli bir siraya koymak "synchronization" olarak adlandirilir.
          StringBuffer "multi-thread" oldugu icin ayni zamanda "synchronized" dir.

3 tane String oluşturan Class ögrendik;
1)immutable string lazımsa;String Class
2)mutable string lazımsa;StringBuilder veya StringBuffer
i)StringBuilder'i multi-thead gerekmezse kullanırız.
ii)StringBuffer'i multi-thead gerekirse kullanırız.

 */
public static void main(String[] args) {
    StringBuffer sbf1= new StringBuffer("Java");


}
}

