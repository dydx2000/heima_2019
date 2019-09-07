package day10.demo14.Demo07;

public class Keyboard implements USB {
    @Override
    public void open(){
        System.out.println("打开键盘");
    }

    public void close(){
        System.out.println("关闭键盘");
    }
    public void type(){
        System.out.println("type");
    }
}
