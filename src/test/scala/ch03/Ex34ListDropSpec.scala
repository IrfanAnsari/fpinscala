package ch03

import org.specs2.mutable.Specification
import List._

class Ex34ListDropSpec  extends Specification{

  "Drop" should {
      "drop the first element of a list with single element and returns Nil" in {
        drop(List(1), 1) mustEqual Nil
      }

    "drop the first element of a list with double element and returns a list with single element" in {
      drop(List(1,2), 1) mustEqual List(2)
    }

    "drop the two element of a list with double element and returns a list with single element" in {
      drop(List(1,2), 2) mustEqual Nil
    }

    "drop the two element of a list with multiple elements and returns a list with single element" in {
      drop(List(1,2,3,4,8,6,7), 5) mustEqual List(6,7)
    }

    "produce an error when you try to drop more elements than what the list has" in {
      drop(List(1,2,3,4,8,6,7), 9) must throwAn(new RuntimeException("Can't drop"))
    }
  }

}
