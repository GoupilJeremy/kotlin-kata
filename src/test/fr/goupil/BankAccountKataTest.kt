package goupil

import org.junit.Test
import kotlin.test.assertEquals

/**
 * Bank account kata
 * Requirements
 * Deposit and Withdrawal
 * Account statement (date, amount, balance)
 * Statement printing
 */

class BankAccountKataTest {

    @Test fun amountOf50ShouldBe150AfterADepositOf100(){
        // In order to save money As a bank client I want to make a deposit in my account
        var bankAccount = BankAccount(50)

        bankAccount.makeDeposit(100)

        assertEquals(bankAccount.deposit, 100)
        assertEquals(bankAccount.amount, 150)
    }

    @Test fun amountOf100ShouldBe80AfterAWithDrawalOf20(){
        // In order to retrieve some or all of my savings As a bank client I want to make a withdrawal from my account
        var bankAccount = BankAccount(100)

        bankAccount.makeWithDrawal(20)

        assertEquals(bankAccount.withDrawal, 20)
        assertEquals(bankAccount.amount, 80)
    }

    @Test fun historyOfOperationsShouldBeVisible(){
        // In order to check my operations As a bank client I want to see the history (operation, date, amount, balance) of my operations
        var bankAccount = BankAccount(100)

        bankAccount.makeDeposit(100)
        bankAccount.makeWithDrawal(100)

        assertEquals(bankAccount.accountStatements.size, 2)

    }
}

fun main(args: Array<String>) {
}
