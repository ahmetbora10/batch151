package javaders.day18costructorsstatickeyword;

public class MethodOverloading {


    public static void main(String[] args) {

    }
    public static int add(int a,int b){
        return a+b;
            }
            public static int add(int a, int b,int c){
        return a+b+c;
        }
        public static double add(double a, int b){
        return a+b;
        }
        public static double add(int a , double b){
        return a+b;
        }

}
