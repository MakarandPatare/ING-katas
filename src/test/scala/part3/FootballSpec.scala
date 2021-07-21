package part3

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class FootballSpec extends AnyFunSuite with Matchers {

  test("should calculate goal difference correctly when 'for' > 'against'") {
    val expected = 6
    val actual = TableRow("SomeTeam", 15, 9).getAbsoluteGoalDifference
    actual shouldEqual expected
  }
  test("should calculate goal difference correctly when 'for' < 'against'") {
    val expected = 6
    val actual = TableRow("SomeTeam", 9, 15).getAbsoluteGoalDifference
    actual shouldEqual expected
  }
  test("should return correct answer if there is single team with smallest goal difference") {
    val expected = List(("Tottenham"))
    val filePath = "src/test/scala/part3/resources/football_min_goal_difference_single_team.dat"
    val actual = Football.getTeamWithSmallestGoalDifference(filePath).map(t => t.team)
    actual shouldEqual expected
  }
  test("should return correct answer if there are two teams with smallest goal difference") {
    val expected = List("Tottenham", "Blackburn")
    val filePath = "src/test/scala/part3/resources/football_min_goal_difference_two_teams.dat"
    val actual = Football.getTeamWithSmallestGoalDifference(filePath).map(t => t.team)
    actual shouldEqual expected
  }
  test("should return correct answer if smallest goal difference is negative - negative absolute") {
    val expected = List("Fulham")
    val filePath = "src/test/scala/part3/resources/football_min_goal_difference_negative.dat"
    val actual = Football.getTeamWithSmallestGoalDifference(filePath).map(t => t.team)
    actual shouldEqual expected
  }
}
