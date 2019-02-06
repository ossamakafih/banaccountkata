package soat.bankaccount

import com.google.common.util.concurrent.AtomicDouble
import soat.bankaccount.model.Transaction

class PrintAccount {

  val header = "operation || date || transaction_amount || type || balance"


  def showTransaction(transaction: List[Transaction]) = {
    val balance = new AtomicDouble(0)

    transaction.map { t =>
      var newBalnce = balance.addAndGet(t.amount)
      if (t.amount < 0){
        s"${t.operation} || ${t.Date} ||  ${t.amount} || withdraw || ${newBalnce}"
      }
      else{
        s"${t.operation} || ${t.Date} ||  ${t.amount} || deposit || ${newBalnce}"
      }
    }.foreach(println)
  }
}
