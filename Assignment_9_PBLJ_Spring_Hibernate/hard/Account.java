import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
    @Id
    private int accountId;
    private double balance;

    // Getters and setters
    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}