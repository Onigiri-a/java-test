package interfaceText;

public class interfaceText1 {
    public static void main(String[] args) {
        computer com=new computer();

        flash fla=new flash();
        com.transfer(fla);

        com.transfer(new implement());
        com.transfer(new USB() {
            @Override
            public void start() {
                System.out.println("kai");
            }

            @Override
            public void stop() {
                System.out.println("关闭");
            }
        });
        USB phone=new USB() {
            @Override
            public void start() {
                System.out.println("kaishi");
            }

            @Override
            public void stop() {
                System.out.println("关闭");
            }
        };
        com.transfer(phone);






    }
}
class computer{

    public void transfer(USB usb){
        usb.start();
        System.out.println("执行中、、、、、、");
        usb.stop();
    }
}


interface USB{
    void start();
    void stop();
}
class flash implements USB{

    @Override
    public void start() {
        System.out.println("闪光打开");
    }

    @Override
    public void stop() {
        System.out.println("闪光关闭");
    }
}
class implement implements USB{

    @Override
    public void start() {
        System.out.println("执行打开");
    }

    @Override
    public void stop() {
        System.out.println("执行关闭");
    }
}