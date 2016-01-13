package ch03

import org.specs2.mutable.Specification

class Ex321FilterWithFlatMapSpec  extends Specification{
  "Filter with flatMap" should {
    "remove the element matching the predicates" in {
      List.filterWithFlatMap(List(1, 2, 3, 4, 5, 6))(x => x % 2 == 0) mustEqual List(1, 3, 5)
    }
  }

}
