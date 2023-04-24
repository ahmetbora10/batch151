package javaders.day25polymorphism;

import day25polymorphism.Animal;

public class Cat extends day25polymorphism.Animal {
    public  void meow(){

    }
   @Override//Override Annotation override kurallarini java tarafindan kontrol edilmesini saglar
    public void move() {
       //Child daki override edilmis eat() methoduna "Overriding Method" denir
       //Parent taki override edilmis eat() methoduna "Overriden Method" denir
        System.out.println("Cats move...");
    }

    @Override
    public int add(int a, int b) {
        return a+b+1;
    }




    @Override
    public Animal create() {
        return super.create();
    }

    @Override
    public Integer multiply(Integer a, Integer b) {
        return 2*a*b;
    }

}