package test

import fr.goupil.Account
import fr.goupil.Console
import org.junit.Test
import org.mockito.Mockito.verify


class BankAccountKataTest {

    @Test fun should_print_all_account_operations(){
        val account = Account()
        val console = Console()

        account.addDeposit(100)
        account.addWithDrawal(20)

        verify(console).printline("operation | date | amount | balance")
        verify(console).printline("deposit | 19/03/2018 | 100 | 1000")
        verify(console).printline("operation | 20/03/2018 | -20 | 980")

    }
}

fun main(args: Array<String>) {
}
