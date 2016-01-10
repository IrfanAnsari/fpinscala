package ch03

import ch03.List.reverse
import org.specs2.mutable.Specification

class Ex312ReverseStringSpec extends Specification{

  "Reverse" should {
      "produce the empty list for an empty list" in {
       reverse(Nil) mustEqual Nil
      }

    "produce the reverse of a given list" in {
       reverse(List(1,2,3)) mustEqual List(3,2,1)
      }
  }
}
