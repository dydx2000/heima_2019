package day11.demo01.Demo03;

import com.sun.org.apache.bcel.internal.classfile.InnerClass;

public class Body {


    public class Heart{
        public void beat(){
            System.out.println("心脏跳动:蹦蹦蹦");
            System.out.println("我叫:"+name);
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public void methodBody(){
        System.out.println("外部类方法!");
        Heart hear =new Heart();
        new Heart().beat();
    }
}
