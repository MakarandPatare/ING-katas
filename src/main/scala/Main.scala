import part1.NumbersPrinter
import part2.Triangle
import part3.Football

object Main extends App {
  println("Part 1")
  NumbersPrinter.printOneToTen
  println("Part 2")
  println(s"Area of Triangle with base 14.30 and height 4.0 is: ${Triangle(14.30, 4.0).area}")
  println("Part 3")
  private val filePath = "src/main/scala/part3/resources/football.dat"
  println("Team(s) with the smallest difference in 'for' and 'against' goals: ")
  Football.getTeamWithSmallestGoalDifference(filePath).foreach(tr =>
    println(s"* Team: ${tr.team}, Goals Scored For: ${tr.goalsFor}, Goals Scored Against: ${tr.goalsAgainst}"))
}
