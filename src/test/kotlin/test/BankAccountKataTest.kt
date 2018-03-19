package test

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

    @Test fun testStoryOne(){
        // In order to save money As a bank client I want to make a deposit in my account
        var bankAccount = BankAccount(50)

        bankAccount.makeDeposit(100)

        assertEquals(bankAccount.deposit, 100)
        assertEquals(bankAccount.amount, 150)
    }

    @Test fun testStoryTwo(){
        // In order to retrieve some or all of my savings As a bank client I want to make a withdrawal from my account
        var bankAccount = BankAccount(100)

        bankAccount.makeWithDrawal(20)

        assertEquals(bankAccount.withDrawal, 20)
        assertEquals(bankAccount.amount, 80)
    }

    @Test fun testStoryThird(){
        // In order to check my operations As a bank client I want to see the history (operation, date, amount, balance) of my operations
        var bankAccount = BankAccount(100)

        bankAccount.makeWithDrawal(20)
        bankAccount.makeDeposit(100)
        bankAccount.makeWithDrawal(100)

    }
}
