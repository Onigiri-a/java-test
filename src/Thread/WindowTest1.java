package Thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @description:ʹ�ü̳�������Ʊ����
 * @author: chenhz Email:chenhuaizhi800@163.com
 * @version: v
 * @time: 2023/2/16 13:56
 */


public class WindowTest1 {

    /**
     * @description:ʹ��runnable�ӿ�������Ʊ����
     * @author: chenhz Email:chenhuaizhi800@163.com
     * @version: v
     * @time: 2023/2/16 13:56
     */
    public static void main (String[] args) {

        Window1 window1 = new Window1();

        Thread t1 = new Thread(window1);
        Thread t2 = new Thread(window1);
        Thread t3 = new Thread(window1);

        t1.setName("����1-");
        t2.setName("����2-");
        t3.setName("����3-");
        t1.start();
        t2.start();
        t3.start();
    }
}

 class Window1 implements Runnable {
     private static int ticket = 100;

     //ʵ������
     private ReentrantLock reentrantLock=new ReentrantLock(true);


     @Override
     public void run() {
         while (true) {
             //����lock����
             reentrantLock.lock();
           try{
               if (ticket > 0) {
                   try {
                       Thread.sleep(100);
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
                   System.out.println(Thread.currentThread().getName() + ":��Ʊ��Ʊ��Ϊ��" + ticket);
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
