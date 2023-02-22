package Thread;

/**
 * @description:ʹ�ü̳�������Ʊ����
 * @author: chenhz Email:chenhuaizhi800@163.com
 * @version: v
 * @time: 2023/2/16 13:56
 */


public class WindowTest {

////    ʹ�ü̳�������Ʊ����
//    public static void main(String[] args) {
//        Window  t1= new Window();
//        Window  t2= new Window();
//        Window  t3= new Window();
//        t1.setName("����һ");
//        t2.setName("���ڶ�");
//        t3.setName("������");
//        t1.start();
//        t2.start();
//        t3.start();
//    }
//}
//
//class Window extends Thread{
//    private static  int ticket=100;
//    @Override
//    public void run() {
//        while(true){
//            if(ticket>0){
//                System.out.println(getName()+":��Ʊ��Ʊ��Ϊ��"+ticket);
//                ticket--;
//            }else{
//                break;
//            }
//        }
//    }

//------------------------------------------------------------


    /**
     * @description:ʹ��runnable�ӿ�������Ʊ����
     * @author: chenhz Email:chenhuaizhi800@163.com
     * @version: v
     * @time: 2023/2/16 13:56
     */
    public static void main(String[] args) {

        Window window = new Window();

        Thread t1 = new Thread(window);
        Thread t2 = new Thread(window);
        Thread t3 = new Thread(window);

        t1.setName("����һ");
        t2.setName("���ڶ�");
        t3.setName("������");
        t1.start();
        t2.start();
        t3.start();
        t3.start();
    }
}

class Window implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + ":��Ʊ��Ʊ��Ϊ��" + ticket);
                ticket--;
            } else {
                break;
            }
        }
    }
}
