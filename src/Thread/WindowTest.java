package Thread;

/**
 * @description:使用继承满足买票操作
 * @author: chenhz Email:chenhuaizhi800@163.com
 * @version: v
 * @time: 2023/2/16 13:56
 */


public class WindowTest {

////    使用继承满足买票操作
//    public static void main(String[] args) {
//        Window  t1= new Window();
//        Window  t2= new Window();
//        Window  t3= new Window();
//        t1.setName("窗口一");
//        t2.setName("窗口二");
//        t3.setName("窗口三");
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
//                System.out.println(getName()+":买票，票号为："+ticket);
//                ticket--;
//            }else{
//                break;
//            }
//        }
//    }

//------------------------------------------------------------


    /**
     * @description:使用runnable接口满足买票操作
     * @author: chenhz Email:chenhuaizhi800@163.com
     * @version: v
     * @time: 2023/2/16 13:56
     */
    public static void main(String[] args) {

        Window window = new Window();

        Thread t1 = new Thread(window);
        Thread t2 = new Thread(window);
        Thread t3 = new Thread(window);

        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");
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
                System.out.println(Thread.currentThread().getName() + ":买票，票号为：" + ticket);
                ticket--;
            } else {
                break;
            }
        }
    }
}
