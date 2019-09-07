package day09;
/*
抽象方法,就是加上abstract 关键字,然后去掉大括号,
如何使用抽象类和抽象类对象。
1. 不能直接创建new 抽象类对象；
2.必须用一个子类来继承抽象父类;
3. 子类必须覆盖重写抽象父类当中所有的抽象方法.
覆盖重写(实现): 子类专掉抽象方法的abstract 关键字,然后补上
方法体大括号.
4. 创建子类对象进行使用.
 */
public abstract class  Animal {
    //
    public abstract void eat();
    public abstract void sleep();

    public void nomalMethod(){
        System.out.println("我是普通方法");
    }

}
