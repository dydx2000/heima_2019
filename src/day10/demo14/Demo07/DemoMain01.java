package day10.demo14.Demo07;

public class DemoMain01 {

    public static void main(String[] args) {
        //创建一台电脑;
        Computer computer = new Computer();
        computer.powerOn();
        //准备一个鼠标供使用;
 //       Mouse mouse =new Mouse();

        USB usbMouse =new Mouse();
        //首先向上转型
        computer.useDevice(usbMouse);
        //准备一个键盘;
        USB usbKeyboard = new Keyboard();
        computer.useDevice(usbKeyboard);

        computer.powerOff();
    }
}
