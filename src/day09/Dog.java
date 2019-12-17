package day09;

public abstract class Dog extends Animal {
    public static void main(String[] args) {
////        Dog dog = new Dog();
//        dog.eat();
//        dog.sleep();
    }

    @Override
    public void eat(){
        System.out.println("狗啃骨头!!");
    };
    public abstract void sleep();

    };


