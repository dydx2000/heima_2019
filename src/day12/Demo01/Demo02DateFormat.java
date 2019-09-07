package day12.Demo01;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//模式中连接符号可以改变,其他不能改变.
public class Demo02DateFormat {

    public static void main(String[] args) throws ParseException {
        demo01();
    }
/*
    使用dateformat类中的方法,把日期格式化为文本
    1,创建simpleDateFormat对象,

 */
    private static void demo01() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd号");
        Date date = new Date();
        String d = sdf.format(date);
        System.out.println(date);
        System.out.println(new SimpleDateFormat("yyyy年MM月dd号").format(date));
        System.out.println(new SimpleDateFormat("MM月dd日, 公元 yyyy年").format(date));
        Date date2 = sdf.parse("2019年06月07号");
        System.out.println("解析时间字符串: "+sdf.parse("2019年06月08号"));
        System.out.println("解析时间字符串: "+date2);
    }

}
