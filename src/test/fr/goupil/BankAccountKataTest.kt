package goupil

import goupil.BankAccount.Companion.DEPOSIT
import goupil.BankAccount.Companion.WITHDRAWAL
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals

/**
 * Bank account kata
 * Requirements
 * Deposit and Withdrawal
 * Account statement (date, amount, balance)
 * Statement printing
 *
 * US1:
 * - In order to save money As a bank client I want to make a deposit in my account
 *
 * US2:
 * - In order to retrieve some or all of my savings As a bank client I want to make a withdrawal from my account
 *
 * US3:
 * - In order to check my operations As a bank client I want to see the history (operation, date, amount, balance) of my operations
 */

class BankAccountKataTest {

    companion object {
        const val AMOUNT_OF_100 = 100
        const val AMOUNT_OF_20 = 20
        
        lateinit var bankAccount: BankAccount
    }

    @Before fun prepareTest() {
        bankAccount = BankAccount()
    }

    @Test fun ShouldAddAdepositDepositOf100(){

        bankAccount.makeDeposit(AMOUNT_OF_100)

        assertEquals(bankAccount.accountStatements.size, 1)

        assertEqualsStatements(bankAccount.accountStatements, AMOUNT_OF_100, DEPOSIT)

    }

    @Test fun shouldAddAWithDrawalOf20(){

        bankAccount.makeWithDrawal(AMOUNT_OF_20)

        assertEquals(bankAccount.accountStatements.size, 1)

        assertEqualsStatements(bankAccount.accountStatements, AMOUNT_OF_20, WITHDRAWAL)

    }

    @Test fun historyOfOperationsShouldBeVisible(){

        bankAccount.makeDeposit(AMOUNT_OF_100)
        bankAccount.makeWithDrawal(AMOUNT_OF_100)

        assertEquals(bankAccount.accountStatements.size, 2)

    }

    private fun assertEqualsStatements(accountStatements: List<Operation>, amountExpected: Int, nameOfOperation: String) {
        assertEquals(accountStatements.first().amount, amountExpected)
        assertEquals(accountStatements.first().name, nameOfOperation)
    }
}

fun main(args: Array<String>) {
}
