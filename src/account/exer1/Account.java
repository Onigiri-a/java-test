package account.exer1;

public class Account {
    private  int id;
    private  double balance;
    private  double annua;

    public Account() {
    }
    public Account(int id, double balance, double annua) {
        this.id = id;
        this.balance = balance;
        this.annua = annua;
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

    public double getAnnua() {
        return annua;
    }

    public void setAnnua(double annua) {
        this.annua = annua;
    }

    public void draw(double amount){
        if(balance<amount){
            System.out.println("Ǯ�����ˣ�������ȡǮ");
            return;
        }
        System.out.println("����ȡǮ");
        balance-=amount;
        System.out.println("chenggongȡǮ");
    }
    public void deposit(double amount){
        balance+=amount;
        System.out.println("chenggong��Ǯ");
    }


}
