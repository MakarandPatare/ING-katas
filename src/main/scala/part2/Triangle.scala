package part2

case class Triangle(base: BigDecimal, height: BigDecimal) {
  require(base != 0)
  require(height !=0)
  def area: BigDecimal = {
    (base * height) / 2
  }
}
