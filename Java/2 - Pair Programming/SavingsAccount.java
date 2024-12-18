import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(double interestRate){
        super();
        this.interestRate = interestRate;
    }

    public void addInterest (){
        this.balance = this.balance + (this.balance * interestRate);
    }
}