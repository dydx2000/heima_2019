package day11.demo01.Demo05;
/*
如果接口的实现类,或者是父类的子类,只需要使用唯一的一次.
那么这种 情况下 就可以省略掉该类的定义,而改为使同学 匿名内部类

匿各内部类的定义格式;
接口名称 对象名 = new 接口名称(){
 //覆盖重写所有抽象方法
};
 */
import day10.demo14.MyinterfaceAbstractImpl;

public class DemoMain {
    public static void main(String[] args) {
        MyInterfaceImpl impl = new MyInterfaceImpl();
        impl.method();

        //匿名内部类
        MyInterface obj =new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部内实现了方法!");

            }
        };
        obj.method();
    }
}
