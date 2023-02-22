package Thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @description:使用继承满足买票操作
 * @author: chenhz Email:chenhuaizhi800@163.com
 * @version: v
 * @time: 2023/2/16 13:56
 */


public class WindowTest1 {

    /**
     * @description:使用runnable接口满足买票操作
     * @author: chenhz Email:chenhuaizhi800@163.com
     * @version: v
     * @time: 2023/2/16 13:56
     */
    public static void main (String[] args) {

        Window1 window1 = new Window1();

        Thread t1 = new Thread(window1);
        Thread t2 = new Thread(window1);
        Thread t3 = new Thread(window1);

        t1.setName("窗口1-");
        t2.setName("窗口2-");
        t3.setName("窗口3-");
        t1.start();
        t2.start();
        t3.start();
    }
}

 class Window1 implements Runnable {
     private static int ticket = 100;

     //实例化锁
     private ReentrantLock reentrantLock=new ReentrantLock(true);


     @Override
     public void run() {
         while (true) {
             //调用lock（）
             reentrantLock.lock();
           try{
               if (ticket > 0) {
                   try {
                       Thread.sleep(100);
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
                   System.out.println(Thread.currentThread().getName() + ":买票，票号为：" + ticket);
                   ticket--;
               } else {
                   break;
               }
           }finally {
               reentrantLock.unlock();

           }

         }
     }
}
