package day11.demo01.Demo04;

public class Outer {

    public void methodOuter(){


        class Inner{
            int num =10;
            public void methodInner(){
                System.out.println(num);
            }
        }
        Inner obj = new Inner();
        obj.methodInner();


    }
}
