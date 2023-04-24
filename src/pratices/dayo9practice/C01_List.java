package pratices.dayo9practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_List {
    public static void main(String[] args) {
    /*
    Bir list olusturunuz. 1'den 15'e kadar sayıları bu liste ekleyiniz.
    Daha sonra 10'dan buyuk olan tum elemanları 2 katına cıkarınız
    */
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {//=
            // dan son elemanina kadar donguye aldik.
            if (list.get(i) > 10) {//If blogundaki i inci indexi get ile 10"dan buzuk mu dize kontrol ederiz
                list.set(i, list.get(i) * 2);
            }


        }
        System.out.println(list);
    }
}