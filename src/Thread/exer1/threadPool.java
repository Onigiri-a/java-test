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
//1. �ṩָ���߳��������̳߳�
        ExecutorService service = Executors.newFixedThreadPool(10);
//2. ִ��ָ�����̲߳�������Ҫ�ṩʵ��runnable�ӿڻ���callable�ӿ�ʵ����Ķ���
        service.execute(new NumberThread());//������runnable
        service.execute(new NumberThread1());//������runnable
//      service.submit();//������callable
//3. �ر����ӳ�
        service.shutdown();
    }
}
class NumberThread implements Runnable{

    @Override
    public void run() {
        Thread.currentThread().setName("�߳�һ��");
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
        Thread.currentThread().setName("�̶߳���");
        for (int i = 0; i <100 ; i++) {
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+":  "+i);
            }
        }
    }
}