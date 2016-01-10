package ch02

import scala.annotation.tailrec

object Fibonacci {

  def generate(i: Int): Int = {

    @tailrec
    def calculate(n: Int, x: Int, y: Int): Int = n match {
      case 0 => x
      case _ => calculate(n - 1, y, x + y)
    }

    calculate(i, 0, 1)
  }
}
