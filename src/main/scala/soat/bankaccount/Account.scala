package soat.bankaccount

import soat.bankaccount.model.Transaction

class Account(date: DateTransaction, printStatement: PrintAccount) {

  var id = 1
  var transactions = List[Transaction]()

  def deposit(amount: Double): Unit = {
    transactions = transactions :+ Transaction(id, date.today(), amount)
    id = id + 1
  }

  def withdraw(amount: Double): Unit = {
    val newAmount = -amount
    transactions = transactions :+ Transaction(id, date.today(), newAmount)
    id = id + 1
  }

  def history(): List[Transaction] = transactions

  def printer(): Unit = {
    println(printStatement.header)
    printStatement.showTransaction(this.history())
  }

}
