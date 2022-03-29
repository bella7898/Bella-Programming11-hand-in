import java.util.Date;

public class Deposit {
    private double amount;
    private Date date;
    private String account;

    Deposit(double amount, Date date, String account){
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    @Override
    public String toString(){
        //your code here
        String string = "Deposit of: $" + amount + " ";
        String string1 = "Date: " + date + " ";
        String string2 = "Into account: " + account + ".";
        return string + string1 + string2;
    }

    public double getAmount(){
        return amount;
    }
    public Date getDate(){
        return date;
    }
    public String getAccount(){
        return account;
    }
}
