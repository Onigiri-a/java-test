package Thread.exer;

/**
 * @description:
 * @author: chenhz Email:chenhuaizhi800@163.com
 * @version: v
 * @time: 2023/2/20 17:48
 */


public class AccountTest1 {

    public static void main(String[] args) {
        Account1 Account1 = new Account1(0);

        Customer1 customer1 = new Customer1(Account1);
        Thread thread1=new Thread(customer1);
        Thread thread2=new Thread(customer1);

        thread1.setName("线程1===");
        thread2.setName("线程2===");
        thread1.start();
        thread2.start();


    }


}

class Account1 {
    private static double balance;

    Account1() {
    }

    Account1(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public static synchronized void deposit(double amt) {

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            balance += amt;
            System.out.println(Thread.currentThread().getName() + balance);

    }

}


class Customer1 implements Runnable {
    private Account1 acct;

    public Customer1(Account1 acct) {
        this.acct = acct;
    }

    public Account1 getAcct() {
        return acct;
    }

    @Override
    public void run() {
        for (int i = 0; i < 13; i++) {
            acct.deposit(1000);
        }
    }
}