package structural.decorator.cuenta

//Base decorator
abstract class AccountDecorator(private val bankAccount: IBankAccount) : IBankAccount {

    override fun openAccount(account: Account) {
        bankAccount.openAccount(account)
    }
}


//
class ArmorDecorator(bankAccount: IBankAccount) : AccountDecorator(bankAccount) {

    override fun openAccount(account: Account) {
        super.openAccount(account)
        addArmor(account)
    }

    private fun addArmor(account: Account){
        println(""" -----------
            Add armor to the account: ${account.client}
        """.trimMargin())
    }

}

fun main() {
    val account = Account(7, "we")
    val savingAccount = SavingAccount(account)

    val ad = ArmorDecorator(savingAccount)
    ad.openAccount(account)
}