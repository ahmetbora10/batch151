package javaders.day17multidimensionlarraypassbyvaule;

import java.util.Arrays;

public class MultiDimensonalArray01 {
    /*
    1)Bir array'in elemanları da array olursa bu tarz array'lerte "Multidememsiona Array" denir

     */
    public static void main(String[] args) {

        //*"Multidememsiona Array" nasıl oluşturulur?
        //"Multidimensional Array" nasil olusturulur?
        String names[][] = new String[3][2];

        //"Multidimensional Array"e eleman nasil eklenir?
        names[1][0] = "P";
        names[2][1] = "Z";
        names[0][0] = "A";
        names[0][1] = "K";
        names[1][1] = "M";
        names[2][0] = "C";

        //"Multidimensional Array" leri console'a yazdirmak icin "toString()" method;u degil "deepToString()" method'unu kullaniniz
        System.out.println(Arrays.deepToString(names));// [[A, K], [P, M], [C, Z]]

        //Multidimensional Array icinden specific bir eleman nasil yazdirilir?
        System.out.println(names[1][1]);//M

        //Multidimensional Array icindeki bir array nasil yazdirilir?
        System.out.println(Arrays.toString(names[0]));//[A, K]
        System.out.println(Arrays.toString(names[1]));//[P, M]

        //Kisa yoldan Multidimensional Array nasil olusturulur?
        String students[][] = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Kayahan"}};

        //Example 1: Yukaridaki students array'inde toplam kac isim oldugunu bulunuz.
        int sum = 0;
        //{ {"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Kayahan"} }
        for (String[] w : students) {
            sum = sum + w.length;
        }
        System.out.println(sum);

        //Example 2: Yukaridaki students array'inde icinde "m" olan isimleri console'a yazdiriniz

        //{ {"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Kayahan"} }
        for (String[] w : students) {
            for (String k : w) {
                if (k.contains("m")) {
                    System.out.println(k);
                }
            }
        }

        //Example 3: Bir integer multidimensional array olusturunuz, tum elemanlarin carpimini hesaplayiniz
        int nums[][] = {{5, 4}, {2, 3, 2}, {7}};
        int result = 1;

        for (int[] w : nums) {
            for (int k : w) {
                result = result * k;
            }
        }
        System.out.println(result);

        //Example 4: Iki boyutlu bir array'i tek boyutlu bir array'e ceviriniz
        int numbers[][] = {{5, 4}, {2, 3, 2}, {7}};
        //1.step:iki boyutlu arrayde kaç eleman olduğunu bulan kodu yazmalıyız
        int toplamElemanSayisi =0;
        for (int[] w: numbers){
            toplamElemanSayisi = toplamElemanSayisi +w.length;
        }

        //2.step:Tek boyutlu array'i iki boyutlu array'in eleman sayısını kullanarak oluşturmalıyız.
        int newArr[] =new int[toplamElemanSayisi];

        //3.step: İki boyutlu arrayde'ki elemanları tek boyutlu array2E TRANSFER ETMELİYİM.
        int idx = 0;

        for(int[] w : numbers){
            for(int k : w){
                newArr[idx] = k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newArr));

        //Example 5: Bir integer multidimensional array'deki en kucuk ve en buyuk elemanin toplamini bulunuz.
        int ages[][]={{15,4},{12,43,21},{7}};//==>4+43

        int small =ages[0][0];

    }
}