package account.exer1;

public class CustomerText {
    public static void main(String[] args) {
      Customer cust=  new Customer("xiaochen");
      Account acc=new Account(1000,2000,23);
      cust.setAccount(acc);
      cust.getAccount().deposit(100);
      System.out.println(cust.getAccount().getBalance());
    }
}
