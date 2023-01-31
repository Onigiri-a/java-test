package exer1;

import com.sun.javafx.binding.StringFormatter;

public class Customer {
    private String fname;
    private String lname;
    private Account account;


    public Customer(String f, String l){
        this.fname=f;
        this.lname=l;
    }
    public String getFname(){
        return fname;
    }
    public String getLname(){
        return lname;
    }
    public  Account getAccount(){
        return account;
    }
    public void setAccount(Account account){
        this.account=account;
    }

}
