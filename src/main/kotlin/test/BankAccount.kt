package test

import java.util.*

/**
 * Bank account kata
 * Requirements
 * Deposit and Withdrawal
 * Account statement (date, amount, balance)
 * Statement printing
 */
class BankAccount(i: Int) {
   var amount: Int = i
   var deposit: Int = 0
   var withDrawal: Int  = 0
    var accountStatements: List<Operation> = ArrayList()

    fun makeDeposit(deposit: Int): Int {
          this.deposit = deposit
          this.amount += deposit
          this.accountStatements.add(Operation("deposit", Date(), this.amount, this.deposit))
    }

    fun makeWithDrawal(withDrawal: Int): Int {
          this.withDrawal = withDrawal
          this.amount -= withDrawal
          this.accountStatements.add(Operation("withDrawal", Date(), this.amount, this.withDrawal))
    }
}

