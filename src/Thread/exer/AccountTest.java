package Thread.exer;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @description:
 * @author: chenhz Email:chenhuaizhi800@163.com
 * @version: v
 * @time: 2023/2/20 17:48
 */


public class AccountTest {

    public static void main(String[] args) {
        Account account = new Account(0);

        Customer customer1 = new Customer(account);
        Customer customer2 = new Customer(account);
        customer1.setName("线程1===");
        customer2.setName("线程2===");
        customer1.start();
        customer2.start();


    }


}

class Account {
    private double balance;
    private static ReentrantLock reentrantLock = new ReentrantLock(true);

    Account() {
    }

    Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {

        reentrantLock.lock();
        try {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            balance += amt;
            System.out.println(Thread.currentThread().getName() + getBalance());
        } finally {
            reentrantLock.unlock();
        }
    }

}


class Customer extends Thread {
    private Account acct;

    public Customer(Account acct) {
        this.acct = acct;
    }

    public Account getAcct() {
        return acct;
    }

    @Override
    public void run() {
        for (int i = 0; i < 13; i++) {
            acct.deposit(1000);
        }
    }
}