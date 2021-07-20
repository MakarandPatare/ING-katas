package part1

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class NumbersPrinterSpec extends AnyFunSuite with Matchers{
  test("create printable string of 1 to 10") {
    val expected = "1,2,3,4,5,6,7,8,9,10"
    val actual = NumbersPrinter.printableSequence(1, 10, ",")
    actual shouldEqual expected
  }
}
