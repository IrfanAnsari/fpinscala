package ch03

import org.specs2.mutable.Specification

class Ex319FilterSpec extends Specification {
  "Filter" should {

    "remove the element matching the predicates" in {
      List.filter(List(1, 2, 3, 4, 5, 6))(x => x % 2 == 0) mustEqual List(1, 3, 5)
    }

    "remove element from the list if they are less than 5 " in {
      List.filter(List(1, 4, 5, 6, 7, 8, 9))(x => x < 5) mustEqual List(5, 6, 7, 8, 9)
    }
  }

}
