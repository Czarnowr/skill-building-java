package archive.liang.chapter9_objectsAndClasses.task_9_7;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Date;

import static org.assertj.core.api.AssertionsForClassTypes.within;

public class AccountTest {

    @Test
    public void Account_createWithDefaultConstructor_fieldsInitializedCorrectly() {
        //Arrange
        Account account = new Account();
        Date currentDate = new Date();

        //Act
        int accountId = account.getId();
        double accountBalance = account.getBalance();
        double accountAnnualInterestRate = account.getAnnualInterestRate();
        Date accountCreationDate = account.getDateCreated();

        //Assert
        Assertions.assertThat(accountId).isEqualTo(0);
        Assertions.assertThat(accountBalance).isEqualTo(0);
        Assertions.assertThat(accountAnnualInterestRate).isEqualTo(0);
        Assertions.assertThat(accountCreationDate).isEqualTo(currentDate);
    }

    @Test
    public void Account_createWithId1Balance20000AndInterestRate4Point5Percent_fieldsInitializedCorrectly() {
        //Arrange
        Account account = new Account(1, 20000);
        Date currentDate = new Date();
        account.setAnnualInterestRate(4.5);

        //Act
        int accountId = account.getId();
        double accountBalance = account.getBalance();
        double accountAnnualInterestRate = account.getAnnualInterestRate();
        Date accountCreationDate = account.getDateCreated();

        //Assert
        Assertions.assertThat(accountId).isEqualTo(1);
        Assertions.assertThat(accountBalance).isEqualTo(20000);
        Assertions.assertThat(accountAnnualInterestRate).isEqualTo(4.5);
        Assertions.assertThat(accountCreationDate).isEqualTo(currentDate);
    }

    @Test
    public void Account_withdraw2500_correctBalance() {
        //Arrange
        Account account = new Account(1, 20000);

        //Act
        account.withdraw(2500);
        double newAccountBalance = account.getBalance();

        //Assert
        Assertions.assertThat(newAccountBalance).isEqualTo(17500);
    }

    @Test
    public void Account_deposit3000_correctBalance() {
        //Arrange
        Account account = new Account(1, 20000);

        //Act
        account.deposit(3000);
        double newAccountBalance = account.getBalance();

        //Assert
        Assertions.assertThat(newAccountBalance).isEqualTo(23000);
    }

    @Test
    public void Account_withdraw2500Deposit3000_correctBalance() {
        //Arrange
        Account account = new Account(1, 20000);

        //Act
        account.withdraw(2500);
        account.deposit(3000);
        double newAccountBalance = account.getBalance();

        //Assert
        Assertions.assertThat(newAccountBalance).isEqualTo(20500);
    }

    @Test
    public void Account_createAccountAnnualInterestRate4Point5Percent_MonthlyInterestRate0Point00375() {
        //Arrange
        Account account = new Account();
        account.setAnnualInterestRate(4.5);

        //Act
        double monthlyInterestRate = account.getMonthlyInterestRate();

        //Assert
        Assertions.assertThat(monthlyInterestRate).isEqualTo(0.00375);
    }

    @Test
    public void Account_createAccountWith100000AnnualInterestRate4Point5Percent_monthlyInterest375() {
        //Arrange
        Account account = new Account(1, 100000);
        account.setAnnualInterestRate(4.5);

        //Act
        double monthlyInterest = account.getMonthlyInterest();

        //Assert
        Assertions.assertThat(monthlyInterest).isCloseTo(375, within(0.001));
    }

    @Test
    public void Account_setInterestTo4Point5withdraw2500Deposit3000_correctBalanceAndMonthlyInterest() {
        //Arrange
        Account account = new Account(1, 20000);
        account.setAnnualInterestRate(4.5);

        //Act
        account.withdraw(2500);
        account.deposit(3000);
        double newAccountBalance = account.getBalance();
        double monthlyInterest = account.getMonthlyInterest();

        //Assert
        Assertions.assertThat(newAccountBalance).isEqualTo(20500);
        Assertions.assertThat(monthlyInterest).isCloseTo(76.875, within(0.001));
    }
}