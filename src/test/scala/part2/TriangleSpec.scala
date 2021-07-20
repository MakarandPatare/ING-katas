package part2

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class TriangleSpec extends AnyFunSuite with Matchers {
  test("should successfully calculate area of triangle with integer type base and height") {
    val expected = 15
    val actual = Triangle(5, 6).area
    actual shouldEqual expected
  }
  test("should successfully calculate area of triangle with double type base and height") {
    val expected = 17.512
    val actual = Triangle(5.5, 6.368).area
    actual shouldEqual expected
  }
  test("Should throw IllegalArgumentException if base is 0") {
    assertThrows[IllegalArgumentException] {
      Triangle(0, 6.368).area
    }
  }
  test("Should throw IllegalArgumentException if height is 0") {
    assertThrows[IllegalArgumentException] {
      Triangle(6.78, 0).area
    }
  }
  test("Should throw IllegalArgumentException if base and height are 0") {
    assertThrows[IllegalArgumentException] {
      Triangle(6.78, 0).area
    }
  }

}
