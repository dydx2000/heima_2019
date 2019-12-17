package day07;

public class Zi extends Fu {
//    super();
    int num =20;

    public Zi(){
        this(123);

    }
    public Zi(int n){
        super(12);
//
//

    }

    public static void main(String[] args) {

       Zi zi = new Zi();
       zi.showNum();
    }

    public void showNum(){
        int num =10;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
        System.out.println("==================");
        methodB();

    }

    public void methodA(){
        System.out.println("aaaa");
    }
    public void methodB(){
        methodA();
        this.methodA();
        System.out.println("bbb");
    }

}
