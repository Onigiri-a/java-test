package Thread.exer1;

/**
 * @description:
 * @author: chenhz Email:chenhuaizhi800@163.com
 * @version: v
 * @time: 2023/2/22 10:46
 */


public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producter producter = new Producter(clerk);
        Consumer consumer = new Consumer(clerk);
        Consumer consumer1 = new Consumer(clerk);
        producter.setName("������1��");
        consumer.setName("������1��");
        consumer1.setName("������2��");
        producter.start();
        consumer.start();
        consumer1.start();
    }
}

class Clerk {
    private int clerkNum = 0;//��������
    public synchronized void produceProdect() {
        if (clerkNum < 20) {
            clerkNum++;
            System.out.println(Thread.currentThread().getName() + ":��ʼ������" + clerkNum + "��Ʒ");
            notify();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public synchronized void consumeProdect() {
        if (clerkNum > 0) {
            System.out.println(Thread.currentThread().getName() + ":��ʼ���ѵ�" + clerkNum + "��Ʒ");
            clerkNum--;
            notify();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Producter extends Thread {//������
    private Clerk clerk;
    public Producter(Clerk clerk) {
        this.clerk = clerk;
    }
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            clerk.produceProdect();
        }
    }
}

class Consumer extends Thread {
    private Clerk clerk;
    public Consumer(Clerk clerk) {//������
        this.clerk = clerk;
    }
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            clerk.consumeProdect();
        }
    }
}
