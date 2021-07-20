package part1

object NumbersPrinter {
  def printableSequence(first: Int, last: Int, separator: String): String = (first to last).mkString(separator)
  def printOneToTen: Unit = println(printableSequence(1, 10, ","))
}
