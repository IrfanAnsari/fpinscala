package ch03

import ch03.List.{productWithFoldLeft, sumWithFoldLeft}
import org.specs2.mutable.Specification

class Ex311FoldLeftSpec extends Specification {
  "Sum with fold left" should {
    "return 0 for an empty list" in {
      sumWithFoldLeft(Nil) mustEqual 0
    }

    "return sum of a list with multiple elements" in {
      sumWithFoldLeft(List(1,2,3,4,5,6,7,8)) mustEqual 36
    }
  }

  "product with fold left" should {
    "return 1 for an empty list" in {
      productWithFoldLeft(Nil) mustEqual 1
    }

    "return multiplication of all elements in the list" in {
      productWithFoldLeft(List(1,2,3,4)) mustEqual 24
    }
  }
}
