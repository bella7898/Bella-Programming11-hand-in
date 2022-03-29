import java.util.Date;

public class Withdraw {
    private double amount;
    private Date date;
    private String account;

    Withdraw(double amount, Date date, String account){
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    @Override
    public String toString(){
        //your code here
        String string = "Withdrawal of: $" + amount + " ";
        String string1 = "Date: " + date + " ";
        String string2 = "From account: " + account + ".";
        return string + string1 + string2;
    }

    public double getAmount() {
        return amount;
    }
    public Date getDate() {
        return date;
    }
    public String getAccount() {
        return account;
    }
}
