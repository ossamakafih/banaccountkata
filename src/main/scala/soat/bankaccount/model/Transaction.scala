package soat.bankaccount.model

import java.time.LocalDate

//case class for modeling the trasaction
case class Transaction(operation: Int, Date: LocalDate, amount: Double)