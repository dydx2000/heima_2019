package day10.demo14;

public class DfaultA implements MyInterfaceDefault{
    public  void methodAbs() {

    }

    public void methodAbs2(){
        System.out.println("实现了抽象方法二");
    }

    @Override
    public void methodDafault(){
        System.out.println("重写了默认方法AAA");

    }

}
