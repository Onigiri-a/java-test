package account.exer;


public class Account {
    private int id;//账号
    private double balance;//余额
    private double nianlilv;//月利率


    public Account(int id, double balance, double nianlilv) {
        this.id = id;
        this.balance = balance;
        this.nianlilv = nianlilv;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getNianlilv() {
        return nianlilv;
    }

    public void setNianlilv(double nianlilv) {
        this.nianlilv = nianlilv;
    }
    //返回月利率
    public double getMonthlyInterest(){
        return nianlilv/12;

    }
    //取钱
    public void withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
            return;
        }else{
            System.out.println("余额不足");
        }


    }
    //存钱
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            return;
        }else{
            System.out.println("充值为负数");
        }

    }

}
