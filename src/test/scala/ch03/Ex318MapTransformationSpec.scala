package ch03

import org.specs2.mutable.Specification

class Ex318MapTransformationSpec extends Specification{
  "map transformer" should {
      "transform a list of int to a list of int by incrementing each number by one" in {
        List.map(List(2,3,4,5))(x => x + 1) mustEqual List(3,4,5,6)
      }

    "transform a list of int to a list of square of int in the list" in {
        List.map(List(2,3,4,5))(x => x * x) mustEqual List(4,9,16,25)
      }


    "transform a list of doubles to a list of string" in {
      List.map(List(2.0,3.0,4.0,5.0))(x => x.toString) mustEqual List("2.0","3.0","4.0","5.0")
    }

  }

}
