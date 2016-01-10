package ch03

import org.specs2.mutable.Specification
import List._

class Ex33SetHeadSpec extends Specification {

  "SetHead" should {
    "set the first element with the value provided in a list of one element" in {
      setHead(List(2), 3) mustEqual List(3)
    }
    "set the first element with the value provided in a list of multiple elements" in {
      setHead(List(2,4,5,6), 3) mustEqual List(3,4,5,6)
    }
  }
}
