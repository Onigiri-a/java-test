package Thread;

/**
 * @description:创建多线程的方式二：实现runnable接口
 *
 * 1 创建一个实现了runnable接口的类
 * 2实现类去实现runnable中的抽象方法run（）
 * 3创建实现类的对象
 * 4将此对象作为参数传入到thread类的构造器中，创建thread类的对象
 * 5通过thread类的对象调用start（）
 *
 *
 *
 * @author: chenhz Email:chenhuaizhi800@163.com
 * @version: v
 * @time: 2023/2/16 13:51
 */


public class ThreadTest {
    public static void main(String[] args) {
//        4将此对象作为参数传入到thread类的构造器中，创建thread类的对象
        MyThread t1=new MyThread();
        Thread thread1=new Thread(t1);
        Thread thread2=new Thread(t1);
        Thread thread3=new Thread(t1);
        thread1.setName("线程一");
        thread2.setName("线程二");
        thread3.setName("线程====");
//        5通过thread类的对象调用start（）
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
//1 创建一个实现了runnable接口的类
class MyThread implements Runnable{

    private static int ticket=100;
    Object object=new Object();
//    2实现类去实现runnable中的抽象方法run（）
    @Override
    public void run() {
        while (true){

            synchronized(object){
                if(ticket>0){

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+ticket);
                    ticket--;
                }else{
                    break;
                }
            }

        }
    }
}