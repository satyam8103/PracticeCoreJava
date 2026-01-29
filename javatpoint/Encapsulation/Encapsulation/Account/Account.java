package Encapsulation.Account;

public class Account {
    private int acc_no;
    private String name,email;
    private double amount;

    public void setName(String name){
        this.name = name;

    }
    public String getName(){
        return name;
    }

    public int getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
