package ch03

import org.specs2.mutable.Specification
import List._

class Ex35DropWhileSpec extends Specification {
  "Drop while" should {
    "drop the element from the list if it matches the conditions" in {
      dropWhile(List(1, 2, 3, 4, 5, 6, 7, 8, 9), even) mustEqual List(1, 3, 5, 7, 9)
    }

    "return the same list if none of the element passes the condition" in {

      dropWhile(List(1, 3, 5, 7, 9), even) mustEqual List(1, 3, 5, 7, 9)
    }

    "return the Nil list when you pass the Nil with any function" in {
      dropWhile(Nil, even) mustEqual Nil
    }
  }

  def even(item: Int) = item % 2 == 0
}
