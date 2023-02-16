package account.exer1;

public class Customer {
    private String name;
    private Account account;

    public Customer() {
    }

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
