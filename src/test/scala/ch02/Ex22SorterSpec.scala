package ch02

import org.specs2.mutable.Specification

class Ex22SorterSpec extends Specification {

  "IsSorted" should {
    import Ex22Sorter._
    "say if it was sorted" in {
      isSorted(Array(1, 2, 3, 4, 5, 6), ordered) must beTrue
    }

    "say if it was not sorted" in {
      isSorted(Array(1, 2, 3, 4, 6, 5), ordered) must beFalse
    }
  }

  def ordered(x: Int, y: Int) = if (x > y) true else false
}
