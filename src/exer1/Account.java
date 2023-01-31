package exer1;

public class Account {

    private double balance;

    public Account(double init_balance){
        this.balance=init_balance;
    }
    public double getBalance(){
        return balance;
    }
    //存钱操操作
    public void  deposit(double amt){

        if(amt>0){
            balance+=amt;
            System.out.println("存入成功："+amt);
        }
    }
    //取钱操操作
    public void  withdraw(double amt){

        if(balance>=amt){
            balance-=amt;
            System.out.println("取入成功："+amt);
        }else{
            System.out.println("取钱失败");
        }
    }

}
