package day12.Demo03;

public class GenericMethod {
    public static void main(String[] args) {
        GenericMethod gc01 = new GenericMethod();
        gc01.method01(32)   ;
        gc01.method01("abc");
        gc01.method01(new int[]{1, 2, 3});
        gc01.method02(1213);
        method02(true);
        GenericMethod.method02("Hello Java!");
    }
    /*
    定义含有泛型的方法
    格式：
        修饰符《泛型 》 返回值类型 方法名 （参数列表）（使用泛型  ）{
            方法体；
        }
     */
    public <M> void  method01(M m){
        System.out.println(m);
    }

    //定义一个含有泛型的静态方法
    public static <M> void method02(M m){
        System.out.println(m);

    }
}
