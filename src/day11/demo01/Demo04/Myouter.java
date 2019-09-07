package day11.demo01.Demo04;

public class Myouter {
    final int num =1212;
//    num=1;
    class Inner{
        public void InnerMethod(){
            System.out.println(num);

        }
    }
}
