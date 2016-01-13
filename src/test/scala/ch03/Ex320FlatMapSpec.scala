package ch03

import ch03.List.flatMap
import org.specs2.mutable.Specification

class Ex320FlatMapSpec extends Specification {
  "Flat map" should {
    "flat a list and apply map" in {
      flatMap(List(1,2,3,4))(i => List(i,i)) mustEqual List(1,1,2,2,3,3,4,4)
    }
  }

}
