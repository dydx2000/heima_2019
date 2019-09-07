package day10.demo14.Demo05;
/*
instance of 类型
这疵会得到一个bool
 */
public class Demo02Instanceof {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();//猫吃鱼
        //如果希望调用子类特有方法,需要向下转型
       if (animal instanceof Dog){
           Dog dog =(Dog) animal;
           dog.watchhouse();

       }
       if (animal instanceof Cat){
           Cat cat =(Cat) animal;
           cat.swim();
       }
    }
}
