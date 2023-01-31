package exer1;

public class bankTest {
    public static void main(String[] args) {
        bank bank = new bank();
        bank.addCustomer("chen","huaizhi");
        bank.getCustomer(0).setAccount(new Account(200));
//        bank.getCustomer(0).getAccount().withdraw(200);
//        bank.getCustomer(0).getAccount().getBalance();

    }
}
