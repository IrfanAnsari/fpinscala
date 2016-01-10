package ch03

import org.specs2.mutable.Specification


class Ex31PatternMatchSpec  extends Specification{

  "It"should {
      "evaluate a pattern matching given in the exercise " in {
        Ex31PatternMatch.evaluateOutPut(List(1,2,3,4,5)) mustEqual 3
      }
  }

}
