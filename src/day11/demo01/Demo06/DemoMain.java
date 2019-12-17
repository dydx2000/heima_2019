package day11.demo01.Demo06;

public class DemoMain {

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("盖伦");
        hero.setAge(20);

        Weapon weapon=new Weapon("朵蓝剑");
        hero.setWeapon(weapon);
        hero.attack();
    }
}
