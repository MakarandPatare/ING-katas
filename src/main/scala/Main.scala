import part1.NumbersPrinter
import part2.Triangle

object Main extends App {
  NumbersPrinter.printOneToTen
  println(s"Area of Triangle is ${Triangle(0.02, 5).area}")
}
