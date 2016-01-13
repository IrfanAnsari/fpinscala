package ch03

import ch03.List.addCorrespondingElements
import org.specs2.mutable.Specification

class Ex322AddTwoListsSpec extends Specification{

  "Add list elements" should {
      "add corresponding elements of two lists" in {
       addCorrespondingElements(List(1,2,3), List(4,5,6)) mustEqual List(5,7,9)
      }
  }

}
