package ch03

import org.specs2.mutable.Specification

class Ex315ListConcatenationSpec extends Specification {
  "List concatenation" should {
    "concatenate a list consists of a list and empty list" in {
      List.concatenate(List(List(1, 2, 3, 4), Nil)) mustEqual List(1, 2, 3, 4)
    }

    "concatenate two non empty list" in {
      List.concatenate(List(List(1, 2, 3, 4), List(5,6,7,9))) mustEqual List(1, 2, 3, 4, 5,6,7,9)
    }
  }

}
