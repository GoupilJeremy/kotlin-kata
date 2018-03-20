package test

import java.util.*

/**
 * Bank account kata
 * Requirements
 * Deposit and Withdrawal
 * Account statement (date, amount, balance)
 * Statement printing
 */
class BankAccount(i: Int = 0) {
   var amount: Int = i
   var deposit: Int = 0
   var withDrawal: Int  = 0
    var accountStatements: MutableList<Operation> = mutableListOf()

    fun makeDeposit(deposit: Int): Int {
          this.deposit = deposit
          this.amount += deposit
          this.accountStatements.add(Operation("deposit", Date(), this.amount, this.deposit))
        return this.amount
    }

    fun makeWithDrawal(withDrawal: Int): Int {
          this.withDrawal = withDrawal
          this.amount -= withDrawal
          this.accountStatements.add(Operation("withDrawal", Date(), this.amount, this.withDrawal))
        return this.amount
    }

    fun showHistoryOfOperations(): Boolean {
        println("statement: name - date - amount - balance")
        for(statement in accountStatements)
            println("statement: ${statement.name} - ${statement.date} - ${statement.amount} - ${statement.balance}")

        return true
    }
}


fun main(args: Array<String>) {
    val bankAccount = BankAccount()
    println("bankAccount amount: ${bankAccount.amount}")
    bankAccount.makeDeposit(500)
    println("bankAccount amount after a deposit: ${bankAccount.amount}")
    bankAccount.makeWithDrawal(50)
    println("bankAccount amount after a withDrawal: ${bankAccount.amount}")

    bankAccount.showHistoryOfOperations()

}
