package ch03

import org.specs2.mutable.Specification
import List._

class Ex32TailSpec extends Specification {


  "Tail" should {
    "be an empty list for an empty list" in {
      tail(Nil) mustEqual Nil
    }

    "be an empty list for a list with single element" in {
      tail(List("a")) mustEqual Nil
    }

    "be a list with single element for a list with two element" in {
      tail(List("a", "b")) mustEqual List("b")
    }

    "be a list without the first element" in {
      tail(List("a", "b", "c")) mustEqual List("b", "c")
    }


  }

}
