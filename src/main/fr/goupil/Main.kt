package goupil

fun main(args: Array<String>) {
    val bankAccount = BankAccount()

    bankAccount.makeDeposit(500)
    
    bankAccount.makeWithDrawal(50)

    bankAccount.showHistoryOfOperations()

}