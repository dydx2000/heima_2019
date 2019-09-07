package day06;

public class Person {
    String name;
    private int  age;
    public void show(){
        System.out.println("我叫: "+name+",年龄: "+age);
//        System.out.println(age);
    }
    public  void setAge(int num){
        age = num;

    }

    public int getAge(){
        return age;
    }

}
