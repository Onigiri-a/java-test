package account.exer;

public class Check extends Account {
    private double overdraft;

    public Check(int id, double balance, double nianlilv,double overdraft) {
        super(id, balance, nianlilv);
        this.overdraft=overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    @Override
    public void withdraw(double amount) {
        if(getBalance()>=amount){
            super.withdraw(amount);
        }else if(overdraft>=amount-getBalance()){
            overdraft-=amount-getBalance();
            withdraw(getBalance());
        }else{
            System.out.println("超出余额");
        }

    }
}
