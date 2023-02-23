package Thread.exer1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @description:
 * @author: chenhz Email:chenhuaizhi800@163.com
 * @version: v
 * @time: 2023/2/22 15:50
 */


public class threadPool {
    public static void main(String[] args) {
//1. 提供指定线程数量的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);
//2. 执行指定的线程操作，需要提供实现runnable接口或者callable接口实现类的对象
        service.execute(new NumberThread());//适用于runnable
        service.execute(new NumberThread1());//适用于runnable
//      service.submit();//适用于callable
//3. 关闭链接池
        service.shutdown();
    }
}
class NumberThread implements Runnable{

    @Override
    public void run() {
        Thread.currentThread().setName("线程一号");
        for (int i = 0; i <100 ; i++) {
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+":    "+i);
            }
        }
    }
}
class NumberThread1 implements Runnable{
    @Override
    public void run() {
        Thread.currentThread().setName("线程二号");
        for (int i = 0; i <100 ; i++) {
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+":  "+i);
            }
        }
    }
}