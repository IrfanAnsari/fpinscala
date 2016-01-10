package ch02

import org.specs2.mutable.Specification

class Ex21FibonacciSpec extends Specification {

"Fibonacci" should {
    "generate number 0 at 0th position" in {
      Fibonacci.generate(0) mustEqual  0
    }

  "generate number 1 at 1st position" in {
    Fibonacci.generate(1) mustEqual 1
  }

  "generate number 1 at 2nd position" in {
    Fibonacci.generate(2) mustEqual 1
  }

  "generate number 2 at 3rd position" in {
    Fibonacci.generate(3) mustEqual 2
  }

  "generate number 3 at 4th position" in {
    Fibonacci.generate(4) mustEqual 3
  }

  "generate number 5 at 5th position" in {
    Fibonacci.generate(5) mustEqual 5
  }

  "generate number 8 at 6th position" in {
    Fibonacci.generate(6) mustEqual 8
  }

  "generate number 13 at 7th position" in {
    Fibonacci.generate(7) mustEqual 13
  }
}
}
