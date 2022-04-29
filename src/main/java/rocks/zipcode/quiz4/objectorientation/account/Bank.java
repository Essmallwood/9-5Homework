package rocks.zipcode.quiz4.objectorientation.account;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public  class Bank {

    private List<BankAccount> bankAccounts;
   //private BankAccount bankAccount;
   // private Integer indexNumber;

public  Bank (){

 bankAccounts = new ArrayList<>();
}


    public void setBankAccount(List<BankAccount> bankAccountList) {
        this.bankAccounts = bankAccountList;
    }

    public List<BankAccount> getBankAccounts() {
        return this.bankAccounts;
    }

    public void removeBankAccountByIndex(Integer indexNumber) {
       // this.indexNumber= indexNumber;
int x = (int) indexNumber;
      bankAccounts.remove(x);
        }

    public void addBankAccount(BankAccount bankAccount) {

        bankAccounts.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
//        throw new UnsupportedOperationException("Method not yet implemented");
       return bankAccounts.contains(bankAccount);
    }
}
