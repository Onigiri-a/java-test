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
                System.out.println("�ر�");
            }
        });
        USB phone=new USB() {
            @Override
            public void start() {
                System.out.println("kaishi");
            }

            @Override
            public void stop() {
                System.out.println("�ر�");
            }
        };
        com.transfer(phone);






    }
}
class computer{

    public void transfer(USB usb){
        usb.start();
        System.out.println("ִ���С�����������");
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
        System.out.println("�����");
    }

    @Override
    public void stop() {
        System.out.println("����ر�");
    }
}
class implement implements USB{

    @Override
    public void start() {
        System.out.println("ִ�д�");
    }

    @Override
    public void stop() {
        System.out.println("ִ�йر�");
    }
}