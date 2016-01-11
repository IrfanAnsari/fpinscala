package ch03

import ch03.List.transform
import org.specs2.mutable.Specification

class Ex316TransformSpec extends Specification{
  "Transform" should {
      "produce an empty list for a given empty list" in {
        transform(Nil) mustEqual Nil
      }
      "produce a list by incrementing each number by 1 " in {
         transform(List(1,2,3,4,5)) mustEqual List(2,3,4,5,6)
      }
  }

}
