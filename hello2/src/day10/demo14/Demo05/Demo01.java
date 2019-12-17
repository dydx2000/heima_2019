package day10.demo14.Demo05;

public class Demo01 {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();
        Cat cat= (Cat) animal;
        cat.swim();

        System.out.println("=============");

        Dog dog = (Dog) animal;


    }

}
