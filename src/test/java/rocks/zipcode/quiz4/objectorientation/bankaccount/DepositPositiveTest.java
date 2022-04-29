package rocks.zipcode.quiz4.objectorientation.bankaccount;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.quiz4.objectorientation.account.BankAccount;
import rocks.zipcode.quiz4.objectorientation.account.Transactable;

/**
 * @author leon on 02/01/2019.
 */
@SuppressWarnings("all")
public class DepositPositiveTest {
    @Test
    public void test1() {
        test(100.0, -1.0);
    }

    @Test
    public void test2() {
        test(100.0, -50.0);
    }

    @Test
    public void test3() {
        test(5005.0, -500.0);
    }

    @Test
    public void test4() {
        test(78000.0, -90.0);
    }

    public void test(Double initialBalance, Double depositAmount) {
        // given
        Double expected = initialBalance + depositAmount;
        BankAccount bankAccount = new BankAccount();
        Transactable transactable = (Transactable)bankAccount;
        bankAccount.setBalance(initialBalance);

        // when
        transactable.deposit(depositAmount);
        Double actual = transactable.getBalance();

        // then
        Assert.assertEquals(expected, actual);
    }
}
