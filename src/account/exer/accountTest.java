package account.exer;

public class accountTest {
    public static void main(String[] args) {
        Account acc=new Account(250,300,1.2);
        acc.withdraw(3000);
        System.out.println("账户余额："+acc.getBalance());
        acc.deposit(500);
        System.out.println("账户余额："+acc.getBalance());
    }
}
