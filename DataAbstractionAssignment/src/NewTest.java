import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NewTest {
    Customer person;
    double testAmount;
    double startBalance;
    String testAccount;

    String CHECKING = "Checking";
    String SAVING = "Saving";

    @Before
    public void before() {
        startBalance = 100.0;
        testAmount = 7898.0;
        testAccount = CHECKING;
        person = new Customer("John Doe", 1, startBalance, startBalance);
    }

    @Test
    public void deposit() {
        person.deposit(testAmount, testAccount);

        assertEquals((testAmount + startBalance), person.returnBalance(testAccount), 0.01);
    }

    @Test
    public void withdraw() {
        person.deposit(testAmount, testAccount);
        person.withdraw(testAmount, testAccount);

        assertEquals(startBalance, person.returnBalance(testAccount), 0.01);
    }

    @Test
    public void checkOverdraft() {
        person.withdraw(testAmount, testAccount);

        double expected = ((double)person.getOverdraftFee() + testAmount) * -1;
        assertEquals((expected + startBalance), person.returnBalance(testAccount), 0.01);
    }

    @Test
    public void printDeposit(){
        Withdraw transaction = new Withdraw(100, null, null);

        String expected = "Withdrawal of: $100.0 Date: null From account: null.";
        assertEquals(expected, transaction.toString());
    }

    @Test
    public void printWithdraw(){
        Deposit transaction = new Deposit(100, null, null);

        String expected = "Deposit of: $100.0 Date: null Into account: null.";
        assertEquals(expected, transaction.toString());
    }

    @Test
    public void checkBalance(){
        person.deposit(testAmount, CHECKING);
        person.deposit(testAmount, SAVING);

        assertEquals((startBalance + testAmount), person.returnBalance(CHECKING), 0.01);
        assertEquals((startBalance + testAmount), person.returnBalance(SAVING), 0.01);

        double expected = (startBalance * 2) + (testAmount * 2);
        assertEquals(expected, person.returnBalance(), 0.01);
    }
}

