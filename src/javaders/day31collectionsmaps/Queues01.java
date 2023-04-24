package javaders.day31collectionsmaps;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {
    public static void main(String[] args) {

        Queue<String> wareHouse =new LinkedList<>();
        wareHouse.add("Milk");
        wareHouse.add("Egg");
        wareHouse.add("Cheese");
        System.out.println(wareHouse);//Milk,Egg,Cheese
        System.out.println(wareHouse.peek());//Milk

    }
}
