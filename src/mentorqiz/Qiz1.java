package mentorqiz;

public class Qiz1 {


  /*  



    Soru-12:Bankamatik Sorusu-->Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bie ATM app. code create ediniz
    Soru-13:Seyahat Projesi-->Bulundugunuz yerden, bir yere yolculuk edeceksiniz.
    A. Köln veya Frankfurta gidebilirsiniz.
    B. Bilet fiyatı hesabı = Her 20 Km başına 5 euro. örn: (100 km yol. Bilet parası  (100/20)* 5 =25 euro
    İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz.
    İşlemlerde direkt bunları cağırabilirsiniz.
    todo İLK OLARAK;
             "Nereye yolculuk etmek istiyorsunuz? (Frankfurt :60KM---Köln:80 KM---(20 KM başına 5 euro bilet parası alınmaktadir..)yazısı gelsin.
                     1.Frankfurt veya Köln olarak bir giriş yapın. (Girdiğiniz sehrin harfleri , girildikten sonra büyük hale gelsin.
    todo Frankfurt girildiyse,
    örn: girdi= Frankfurt
                 case=FRANKFURT:
    Rota = Frankfurt yazdırın.
    Frankfurt km hesabı işlemi yapın. son olarak konsolda: Frankfurt 15 Euro yazsın.
    todo case: KÖLN ise
                 "Rota = Köln" yazdırın. km hesabına göre işlemi yapınız.son olarak konsolda:  Köln   20 Euro yazsın.
            2.Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):" sorusunu sorsun.
            case:1 ise" 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz, bilet ücreti yukarıda çoktan belirlenmiş olur.
            case:2 ise "2 kişilik " yazdırın.2 kişi için bilet fiyatını hesaplayın.
    todo  Son olarak yolculugunuzu check edin;
    konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.
    a.Bakiyemi belirtin.
    b.Toplam Tutarı belirtin.
            c.double paraUstu oluşturun ve hesaplayın.
    d.Double para üstünü yazdırın.
    Soru-14:Kullanıcıdan üç adet sayı alarak bu sayıların bir dik üçgenin kenar uzunlukları olup olmadığını hesaplatan bir kod yazınız
            (İpucu: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor bağlantısından yararlanabilirsiniz)
    Örnek Ekran Çıktısı
    birinci kenarı giriniz: 2
    ikinci kenarı giriniz 15
    üçüncü kenarı giriniz: 7
    Bu bir dik üçgen değildir/Bu bir dik üçgendir
    Soru-15:Katsayıları verilen 2 bilinmeyenli denklemin kökleriniz bulunuz.
    ax^2 + bx + c;
    Çözüm adımları-->kullanıcıdan a,b,c yi okutun.
    Delta = bb - 4ac
    Delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
    Delta = 0 => 1 tane kök vardır x = -b/2a
    Delta < 0 ise kök yoktur.
            Soru-16:Kullanıcının girdiği yılın artık yıl olup olmadığını kontrol eden code create ediniz.
    Soru-17:Kullanicidan bir sayi aliniz
    Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
            10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
    Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
            Soru-18:Kullanicidan bir character girmesini isteyiniz
    Character harf ise kucuk harf olup olmadigini kontrol ediniz
    Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
    Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
    Harf degilse ekrana "Harf degil" yazdiriniz
            97:a  122:z ascii değeri
    Soru-19:Kullanıcıdan bir pozitif tamsayı girmesini isteyin, o pozitif tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
            3 basamaklı degilse çift olup olmadigini kontrol edin. Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
    Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.
            Soru-20:Kullanıcıdan notunu alın ve aşağıdaki kurallara göre console'a A, B, C veya D yazdırın.
            -> 0(dahil) ile 50 arasi - D
		    -> 50(dahil) ile 60 arası - C
		    -> 60(dahil) ile 80 arası - B
		    -> 80(dahil) ustu- A
    Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin

        *** IPUCU--> switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
            switch() de int, byte, short, char, String kullanilir.
        */
}

