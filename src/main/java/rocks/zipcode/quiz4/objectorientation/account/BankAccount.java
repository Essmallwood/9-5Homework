package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable {

    private double balance;


    public void setBalance(Double balance) {
        this.balance = balance;

    }


    @Override
    public void deposit(Double amountToIncreaseBy) {
        balance = amountToIncreaseBy + balance;

    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        balance = balance - amountToDecreaseBy;

    }

    @Override
    public Double getBalance() {
     return balance;
    }
}
