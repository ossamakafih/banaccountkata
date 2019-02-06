package soat.bankaccount

import soat.bankaccount.model.Transaction

class Account(date: DateTransaction, printStatement: PrintAccount) {

  //incremental operation id
  var id = 1
  //initialise list of transactions
  private var transactions = List[Transaction]()

  //depose an amount on account
  def deposit(amount: Double): Unit = {
    transactions = transactions :+ Transaction(id, date.today(), amount)
    id = id + 1
  }

  //withdraw amount from account
  def withdraw(amount: Double): Unit = {
    val newAmount = -amount
    transactions = transactions :+ Transaction(id, date.today(), newAmount)
    id = id + 1
  }

  //List of all transaction maded
  def history(): List[Transaction] = transactions

  //print all account's statement
  def printer(): Unit = {
    println(printStatement.header)
    printStatement.showTransaction(this.history())
  }

}
