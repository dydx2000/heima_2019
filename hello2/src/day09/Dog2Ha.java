package day09;

public class Dog2Ha extends Dog{
    public static void main(String[] args) {
        Dog2Ha ha = new Dog2Ha();
        ha.sleep();
        ha.eat();
    }

    public void sleep(){
        System.out.println("嘿嘿嘿!!!");
    }
    @Override
    public void eat() {
        super.eat();
    }


}