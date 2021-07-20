package part3

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class FootballSpec extends AnyFunSuite with Matchers {
  test("") {
    val expected = "Tottenham"
    val actual = Football.getTeamWithSmallestGoalDifference
    actual shouldEqual expected
  }
}
