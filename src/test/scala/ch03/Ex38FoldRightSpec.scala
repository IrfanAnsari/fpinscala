package ch03

import org.specs2.mutable.Specification
import List._

class Ex38FoldRightSpec  extends Specification{
  "Fold right " should {
      "related to List constructor" in {
        foldRight(List(1,2,3), Nil:List[Int])(Cons(_,_)) mustEqual List(1,2,3)
      }
  }

}
