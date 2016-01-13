package ch03

import org.specs2.mutable.Specification

class Ex323ZipWithSpec extends Specification {

  "ZipWith" should {
      "zip the two list of string with given ops on their corresponding element" in {
       List.zipWith(List("a","b","c"), List("d","e","f"))(_ concat _) mustEqual List("ad","be","cf")
      }

    "zip the two list of ints with given ops on their corresponding element" in {
      List.zipWith(List(1,2,3), List(4,5,6))(_ * _) mustEqual List(4,10,18)
    }
  }

}
