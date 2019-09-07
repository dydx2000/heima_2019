package day09;

public class DogGolden extends Dog{
    public static void main(String[] args) {
        DogGolden golden = new DogGolden();
        golden.eat();
        golden.sleep();
    }

    public void sleep(){
        System.out.println("呼呼!!!");
    }
    @Override
    public void eat() {
        super.eat();
    }
}
