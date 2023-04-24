package javaders.day18costructorsstatickeyword;

public class StudentRuner {
    public static void main(String[] args) {
//Static olan "numOfRegisteredStd" variableyi cagirmak icin sadece class ismini kulandik,object olusturmadik.

        //Static olmayan "num" variableyi cagirmak icin object olusturduk.
        Student s1 =new Student();
        System.out.println("s1.num");

        System.out.println(s1);
    }
}
