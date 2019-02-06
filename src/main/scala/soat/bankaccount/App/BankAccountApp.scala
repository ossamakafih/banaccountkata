package soat.bankaccount.App

import soat.bankaccount.{Account, DateTransaction, PrintAccount}

object BankAccountApp {
  def main(args: Array[String]): Unit = {

    val transactionDate = new DateTransaction
    val statementPrinter = new PrintAccount
    val account = new Account(transactionDate, statementPrinter)


    account.deposit(1000)
    account.deposit(200)
    account.withdraw(500)
    account.withdraw(699)
    account.deposit(500)
    account.withdraw(350)

    account.printer()




  }
}
