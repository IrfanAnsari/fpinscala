package ch03

import org.specs2.mutable.Specification

class Ex39LengthWithFoldRightSpec extends Specification {

  "Length calculator" should {
      "return length of empty list as zero" in {
        List.length(Nil) mustEqual 0
      }

    "return length of single element list as 1" in {
      List.length(List(1)) mustEqual 1
    }

    "return length of two elements list as 2" in {
      List.length(List(1,2)) mustEqual 2
    }

    "return length of multiple elements list" in {
      List.length(List(1,2,6,7,8,9,0,9,7,7,4,5,6,6,8,8)) mustEqual 16
    }
  }
}
