public class Datetime01 {
    public static void main(String[] args) {
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

        public class DateTime01 {

            public static void main(String[] args) {

                //Anlik zamani nasil aliriz?
                LocalTime myCurrentTime = LocalTime.now();
                System.out.println(myCurrentTime);//21:04:02.902041600
                //Java default olarak 24luk saat sistemini kullanir

                //Anlik zamanda bilesenler nasil alinir?
                int hour = myCurrentTime.getHour();
                System.out.println(hour);

                int minut = myCurrentTime.getMinute();
                System.out.println(minut);

                int second = myCurrentTime.getSecond();
                System.out.println(second);

                int nano = myCurrentTime.getNano();
                System.out.println(nano);

                //Gelecek ve gecmis zamana nasil gidilir?
                LocalTime next = myCurrentTime.plusMinutes(23).minusSeconds(11);
                System.out.println(next);

                //Zaman formati nasil degistirilir?
                //"HH"24'luk saat sistemini, "hh" 12'lik saat sistemini kullanir.
                //"hh:mm a" ifadesindeki bosluk " a" 12'lik saat sisteminde "AM", "PM" yazilmasini saglar.
                DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh:mm:ss a");
                String formattedMyCurrentTime = dtf1.format(myCurrentTime);
                System.out.println(formattedMyCurrentTime);



            }
        }

    }
}
