package ch03

import ch03.List.doubleToString
import org.specs2.mutable.Specification

class Ex317DoubleToStringSpec  extends Specification{
  "doubleToString" should {

      "produces an Empty list for a given emty list" in {
        doubleToString(Nil) mustEqual Nil
      }
      "produce a list of strings for a given list of doubles" in {
        doubleToString(List(2.0,3.0,4.0)) mustEqual List("2.0","3.0","4.0")
      }
  }

}
