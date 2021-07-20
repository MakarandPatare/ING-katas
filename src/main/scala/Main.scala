import part1.NumbersPrinter
import part2.Triangle
import part3.Football

object Main extends App {
  NumbersPrinter.printOneToTen
  println(s"Area of Triangle with base 14.30 and height 4.0 is: ${Triangle(14.30, 4.0).area}")
  println(s"Team with the smallest difference in 'for' and 'against' goals is: ${Football.getTeamWithSmallestGoalDifference}")
}
