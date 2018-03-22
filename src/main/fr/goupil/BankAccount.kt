package goupil

import java.util.Date
import kotlin.collections.ArrayList

/**
 * Bank account kata
 * Requirements
 * Deposit and Withdrawal
 * Account statement (date, amount, balance)
 * Statement printing
 */
class BankAccount {
    companion object {
        const val DEPOSIT = "deposit"
        const val WITHDRAWAL = "withDrawal"
    }

    var amount: Int = 0
    var accountStatements: List<Operation> = ArrayList()

    fun makeDeposit(deposit: Int): Int {
          this.amount += deposit
          this.accountStatements = this.accountStatements.plusElement(Operation(DEPOSIT, Date(), this.amount, deposit))
        return this.amount
    }

    fun makeWithDrawal(withDrawal: Int): Int {
          this.amount -= withDrawal
            this.accountStatements = this.accountStatements.plusElement(Operation(WITHDRAWAL, Date(), this.amount, withDrawal))
        return this.amount
    }

    fun showHistoryOfOperations(): Boolean {
        println("statement: name - date - amount - balance")
        for(statement in accountStatements)
            println("statement: ${statement.name} - ${statement.date} - ${statement.amount} - ${statement.balance}")

        return true
    }
}
