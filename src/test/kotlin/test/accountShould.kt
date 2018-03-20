package test

import fr.goupil.OperationRepository
import org.junit.Test
import org.mockito.Mockito.verify


class AccountShould{
    @Test
    fun should_store_a_deposit_operation(){
        val operationRepository = OperationRepository()
        verify(operationRepository).addDeposit(100)
    }
}

fun main(args: Array<String>) {
}