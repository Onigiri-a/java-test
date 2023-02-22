package Thread;

/**
 * @description:�������̵߳ķ�ʽ����ʵ��runnable�ӿ�
 *
 * 1 ����һ��ʵ����runnable�ӿڵ���
 * 2ʵ����ȥʵ��runnable�еĳ��󷽷�run����
 * 3����ʵ����Ķ���
 * 4���˶�����Ϊ�������뵽thread��Ĺ������У�����thread��Ķ���
 * 5ͨ��thread��Ķ������start����
 *
 *
 *
 * @author: chenhz Email:chenhuaizhi800@163.com
 * @version: v
 * @time: 2023/2/16 13:51
 */


public class ThreadTest {
    public static void main(String[] args) {
//        4���˶�����Ϊ�������뵽thread��Ĺ������У�����thread��Ķ���
        MyThread t1=new MyThread();
        Thread thread1=new Thread(t1);
        Thread thread2=new Thread(t1);
        Thread thread3=new Thread(t1);
        thread1.setName("�߳�һ");
        thread2.setName("�̶߳�");
        thread3.setName("�߳�====");
//        5ͨ��thread��Ķ������start����
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
//1 ����һ��ʵ����runnable�ӿڵ���
class MyThread implements Runnable{

    private static int ticket=100;
    Object object=new Object();
//    2ʵ����ȥʵ��runnable�еĳ��󷽷�run����
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