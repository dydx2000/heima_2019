package day10.demo14.Demo07;

public class Mouse implements USB    {
    @Override
    public void open(){
        System.out.println("鼠标连接!");
    }

    public void close(){
        System.out.println("鼠标断开!");

    }
    public void click(){
        System.out.println("click");


    }


}
