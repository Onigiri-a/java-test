package account.exer;

public class CheckAccountTest {
    public static void main(String[] args) {
        Check che=new Check(1122,2000,4.5,5000);
        che.withdraw(3000);
        System.out.println("账户余额："+che.getBalance());
        System.out.println("透支余额："+che.getOverdraft());
        che.withdraw(3000);
        System.out.println("账户余额："+che.getBalance());
        System.out.println("透支余额："+che.getOverdraft());
        che.withdraw(3000);
        System.out.println("账户余额："+che.getBalance());
        System.out.println("透支余额："+che.getOverdraft());
    }
}
