package day11.demo01.Demo07;

public class DemoGame {
    public static void main(String[] args) {
        Hero hero =new Hero();
        hero.setName("艾希");//设置英雄的名称

        //设置英雄技能
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("Biu~biu~biu");
            }
        });
        hero.attack();
    }
}
