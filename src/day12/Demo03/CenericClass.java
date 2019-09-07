package day12.Demo03;

public class CenericClass<E> {
    public static void main(String[] args) {
        CenericClass gc =new CenericClass();
        gc.setName("狗东西")   ;
        Object s = gc.getName();
        System.out.println(s);
        CenericClass<Integer> gc2 = new CenericClass<>();
        gc2.setName(21)  ;
        System.out.println(gc2.getName());;
    }


    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
