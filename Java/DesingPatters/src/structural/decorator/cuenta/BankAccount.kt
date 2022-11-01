package structural.decorator.cuenta

import structural.adapter.employee.EmployeeClient

//Holder Class
data class Account(val id: Long, val client: String)

//Component Interface
interface IBankAccount {
    fun openAccount(account: Account)
}

class SavingAccount(private val account: Account) : IBankAccount {
    override fun openAccount(account: Account) {
        println("-------------------")
        println("Open Saving account to ${account.client}")
    }
}

class CheckingAccount(private val account: Account):IBankAccount{
    override fun openAccount(account: Account) {
        println("-------------------")
        println("Open Checking account to ${account.client}")
    }
}




