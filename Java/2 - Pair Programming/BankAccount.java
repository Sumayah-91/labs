import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class BankAccount {

    private static int nextAccountNumber = 100000;

    private String customerName;
    private int accountNumber;
    private double balance;

    public BankAccount(String customerName, double balance) {
        this.accountNumber = nextAccountNumber();
        this.customerName = customerName;
        this.balance = balance;
    }

    private int generateAccountNumber() {
        return nextAccountNumber++;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public double withdraw(double amount) {
        return this.balance -= amount;
    }

    public void printNextAccountNumber() {
        System.out.println(nextAccountNumber);
    }
}