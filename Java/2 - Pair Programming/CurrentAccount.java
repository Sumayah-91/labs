import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class CurrentAccount extends BankAccount {

    private int overdraftLimit;

    public CurrentAccount (int overdraftLimit) {
        super();
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double withdraw (double amount) {
        if(this.amount > this.overdraftLimit){
            return 0.0;
        } else {
            return this.balance -= this.amount;
        }
    }
}