package goupil

fun main(args: Array<String>) {
    val bankAccount = BankAccount()
    println("bankAccount amount: ${bankAccount.amount}")
    bankAccount.makeDeposit(500)
    println("bankAccount amount after a deposit: ${bankAccount.amount}")
    bankAccount.makeWithDrawal(50)
    println("bankAccount amount after a withDrawal: ${bankAccount.amount}")

    bankAccount.showHistoryOfOperations()

}