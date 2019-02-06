package soat.bankaccount

import java.util.Date
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class DateTransaction {

  private val dd_MM_yyyy = DateTimeFormatter.ofPattern("dd/MM/yyyy")

  //get today date (transation date)
  def today(): LocalDate = LocalDate.now()
}