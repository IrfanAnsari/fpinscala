package ch03

import org.specs2.mutable.Specification
import List._

class Ex36InitSpec  extends Specification{
  "Init" should {
      "throw an exception when you try to operate on empty list" in {
        init(Nil) must throwAn(new RuntimeException("can't do it"))

      }
      "return Nil for a list with an element" in {
        init(List(1)) mustEqual Nil
      }

    "return list with an element for a list with two elements" in {
        init(List(1, 2)) mustEqual List(1)
      }

    "return list with all except last " in {
        init(List(1, 2,6,7,8,9,9,9,12)) mustEqual List(1, 2,6,7,8,9,9,9)
      }


  }

}
