package day10.demo14;

public interface MyInterfaceDefault {

    //抽象方法
    public abstract void methodAbs();
    public abstract void methodAbs2();

    public default void mehtoddefault(){
        System.out.println("默认方法可以不实现!");
    }

    void methodDafault();
}
