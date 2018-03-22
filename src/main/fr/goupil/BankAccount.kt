package goupil

import java.util.Date
import java.util.concurrent.atomic.AtomicInteger
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
        const val HEADER_OPERATION = "name | date | amount | balance"
    }

    var runningBalance: AtomicInteger = AtomicInteger(0)
    var accountStatements: List<Operation> = ArrayList()

    fun makeDeposit(deposit: Int) {
          this.accountStatements = this.accountStatements.plusElement(Operation(DEPOSIT, Date().toString(), deposit))
    }

    fun makeWithDrawal(withDrawal: Int) {
            this.accountStatements = this.accountStatements.plusElement(Operation(WITHDRAWAL, Date().toString(), withDrawal))
    }

    fun showHistoryOfOperations() {
        println(HEADER_OPERATION)
        accountStatements.iterator().forEach {
            statement -> println(statementLine(statement, runningBalance))
        }
    }

    fun statementLine(statement: Operation, runningBalance: AtomicInteger): String  {
        return statement.name
                .plus(" | ")
                .plus(statement.date)
                .plus(" | ")
                .plus(statement.amount)
                .plus(" | ")
                .plus(runningBalance.addAndGet(statement.amount))
        
    }
}
