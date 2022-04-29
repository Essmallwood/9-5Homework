package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable{

   // private BankAccount bankAccount;
   // private double numberOfHours;
    private double hoursWorked;
   private double hourlyWage;
  private BankAccount bankAccountBalance;
  private double balance;

;


    public Employee() {
        this.hourlyWage = 35.0;
        this.hoursWorked = 0.0;
        this.bankAccountBalance = new BankAccount();
       this.balance = 0.0;

    }

    public Employee(BankAccount bankAccount) {

        this.bankAccountBalance =  bankAccount;
        this.hourlyWage = 35.0;
        this.hoursWorked = 0.0;
        this.balance = 15.0;

//        this.balance = getBalance();
//        this.hoursWorked = getHoursWorked();
//        this.hourlyWage = getHourlyWage();

    }

    public BankAccount getBankAccount() {
        return this.bankAccountBalance;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccountBalance = bankAccount;


    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
     // 60 + 5 = 65;
        hoursWorked =  numberOfHours + hoursWorked;
 // numberOfHours = hoursWorked + numberOfHours;
    }

    @Override
    public Double getHoursWorked() {
        return this.hoursWorked;
    }

    @Override
    public Double getHourlyWage() {
        return hourlyWage;
    }

    @Override
    public Double getMoneyEarned() {
        return getHoursWorked() * getHourlyWage();
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        System.out.println(getMoneyEarned()); //

    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {

        System.out.println(getBalance()-amountToDecreaseBy);
    }

    @Override
    public Double getBalance() {
       //return bankAccount.getBalance();
        return this.balance;
    }


    public Double setBalance(Double balance) {
        //return bankAccount.getBalance();
      return this.balance = balance;
    }
}
