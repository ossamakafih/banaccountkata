package soat.bankaccount

import java.util.Date
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class DateTransaction {

  val dd_MM_yyyy = DateTimeFormatter.ofPattern("dd/MM/yyyy")

  def today(): LocalDate = LocalDate.now()
}