package part2

case class Triangle(base: Double, height: Double) {
  require(base != 0)
  require(height !=0)
  def area: Double = {
    (base * height) / 2
  }
}
