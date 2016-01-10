package ch03

import ch03.List.appendWithFoldRight
import org.specs2.mutable.Specification

class Ex314AppendSpec extends Specification {

  "Append" should {
    "append an empty to an existing list yields the same list" in {
      appendWithFoldRight(List(1, 2, 3), Nil) mustEqual List(1, 2, 3)
    }

    "append one list to another list" in {
      appendWithFoldRight(List(1, 2, 3), List(4, 5, 6)) mustEqual List(1, 2, 3, 4, 5, 6)
    }
  }
}
