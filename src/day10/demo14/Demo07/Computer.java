package day10.demo14.Demo07;

public class Computer {
    public void powerOn(){
        System.out.println("笔记本电脑开机");
    }
    public void powerOff(){
        System.out.println("笔记本电脑关机");
    }
    public  void  useDevice(USB usb){
        usb.open();
        usb.close();//关闭设备
        if (usb instanceof Mouse){
            Mouse mouse=(Mouse) usb;
            mouse.click();

        }else if(usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard)usb;
            keyboard.type();
        }



    }
}
