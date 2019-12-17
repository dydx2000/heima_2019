package day11.demo01.Demo03;



public class Outer {
    public static void main(String[]args){
        Outer.Inner inner = new Outer().new Inner();
        inner.methodInner();
    }


    int num =10; //外部类成员变量
    public class Inner{
        int num =20;
        public void methodInner(){
            int num=30;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Outer.this.num);
        }
    }
}
